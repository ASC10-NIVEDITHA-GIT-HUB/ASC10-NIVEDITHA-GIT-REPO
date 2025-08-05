package org.example;

import org.example.dao.FriendDAO;
import org.example.model.Friend;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        FriendDAO dao = new FriendDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n📋 MENU");
            System.out.println("1. Add Friend");
            System.out.println("2. View All Friends");
            System.out.println("3. Update Friend");
            System.out.println("4. Delete Friend");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (ch) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = sc.nextLine();
                    dao.addFriend(new Friend(name, email, phone));
                    break;

                case 2:
                    List<Friend> list = dao.getAllFriends();
                    list.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Enter friend ID to update: ");
                    int idUp = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = sc.nextLine();
                    System.out.print("Enter new phone: ");
                    String newPhone = sc.nextLine();
                    dao.updateFriend(new Friend(idUp, newName, newEmail, newPhone));
                    break;

                case 4:
                    System.out.print("Enter friend ID to delete: ");
                    int idDel = sc.nextInt();
                    dao.deleteFriend(idDel);
                    break;

                case 5:
                    System.out.println("Exiting app...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
