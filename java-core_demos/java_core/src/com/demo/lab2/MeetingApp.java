package com.demo.lab2;

import java.time.*;
import java.util.*;

// === Abstract MeetingRoom ===
abstract class MeetingRoom {
    private final String roomId;
    private final int capacity;
    private final int floor;
    private final List<Booking> bookings = new ArrayList<>();

    public MeetingRoom(String roomId, int capacity, int floor) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.floor = floor;
    }
    public String getRoomId() { return roomId; }
    public int getCapacity() { return capacity; }
    public int getFloor() { return floor; }

    public boolean isAvailable(LocalDate date, LocalTime start, Duration dur) {
        for (Booking b : bookings) {
            if (b.getDate().equals(date) && b.overlaps(start, dur))
                return false;
        }
        return true;
    }

    public Booking reserve(Employee emp, LocalDate date, LocalTime start, Duration dur) {
        if (!isAvailable(date, start, dur))
            throw new IllegalStateException("Room " + roomId + " is not available at that time.");
        Booking b = new Booking(emp, this, date, start, dur);
        bookings.add(b);
        return b;
    }

    public List<Booking> getBookingsByDate(LocalDate date) {
        List<Booking> list = new ArrayList<>();
        for (Booking b : bookings)
            if (b.getDate().equals(date))
                list.add(b);
        return list;
    }
}

// === Zoom-enabled room subclass ===
class ZoomMeetingRoom extends MeetingRoom {
    private final String zoomDeviceId;
    private final String zoomAccountId;

    public ZoomMeetingRoom(String roomId, int capacity, int floor, String devId, String accId) {
        super(roomId, capacity, floor);
        this.zoomDeviceId = devId;
        this.zoomAccountId = accId;
    }
    public String getZoomDeviceId() { return zoomDeviceId; }
    public String getZoomAccountId() { return zoomAccountId; }
    public void startZoomCall(String bookingId) {
        System.out.println("Zoom call started for booking " + bookingId + " via device " + zoomDeviceId);
    }
    public void endZoomCall(String bookingId) {
        System.out.println("Zoom call ended for booking " + bookingId);
    }
}

// === Employee who books rooms ===
class Employee {
    private final String employeeId;
    private final String name;
    private final List<Booking> bookings = new ArrayList<>();

    public Employee(String id, String name) {
        this.employeeId = id;
        this.name = name;
    }
    public Booking bookRoom(MeetingRoom room, LocalDate date, LocalTime start, Duration dur) {
        Booking b = room.reserve(this, date, start, dur);
        bookings.add(b);
        return b;
    }
    public List<Booking> getBookingsForDate(LocalDate date) {
        List<Booking> list = new ArrayList<>();
        for (Booking b : bookings)
            if (b.getDate().equals(date))
                list.add(b);
        return list;
    }
    public String getName() { return name; }
}

// === Booking record ===
class Booking {
    private static long COUNTER = 0;
    private final String bookingId;
    private final Employee employee;
    private final MeetingRoom room;
    private final LocalDate date;
    private final LocalTime start;
    private final Duration dur;

    public Booking(Employee emp, MeetingRoom r, LocalDate date, LocalTime start, Duration dur) {
        this.bookingId = "BKG-" + ++COUNTER;
        this.employee = emp;
        this.room = r;
        this.date = date;
        this.start = start;
        this.dur = dur;
    }
    public String getBookingId() { return bookingId; }
    public Employee getEmployee() { return employee; }
    public MeetingRoom getRoom() { return room; }
    public LocalDate getDate() { return date; }
    public LocalTime getStartTime() { return start; }
    public Duration getDuration() { return dur; }

    public LocalTime getEndTime() { return start.plus(dur); }
    public boolean overlaps(LocalTime ostart, Duration odur) {
        LocalTime oend = ostart.plus(odur);
        return !(getEndTime().compareTo(ostart) <= 0 || oend.compareTo(start) <= 0);
    }
}

// === Main Application ===
public class MeetingApp {
    public static void main(String[] args) {
        Employee alice = new Employee("E001", "Alice");
        MeetingRoom room1 = new ZoomMeetingRoom("ZM-101", 6, 2, "ZD-11", "ZA-1001");
        MeetingRoom room2 = new MeetingRoom("MR-201", 4, 3) {};

        LocalDate date = LocalDate.of(2025, 7, 20);
        LocalTime t1 = LocalTime.of(9, 0);
        Duration oneHr = Duration.ofHours(1);

        Booking b1 = alice.bookRoom(room1, date, t1, oneHr);
        System.out.println(alice.getName() + " booked " + b1.getRoom().getRoomId() + " at " + b1.getStartTime());

        ((ZoomMeetingRoom)room1).startZoomCall(b1.getBookingId());
        ((ZoomMeetingRoom)room1).endZoomCall(b1.getBookingId());

        Booking b2 = alice.bookRoom(room2, date, t1.plusHours(1), oneHr);

        System.out.println("\n== Bookings on " + date + " ==");
        for (Booking b : alice.getBookingsForDate(date)) {
            System.out.println(b.getBookingId() + " | Room: " + b.getRoom().getRoomId() +
                    " | Time: " + b.getStartTime() + "–" + b.getEndTime());
        }
    }
}
