package org.example.dao;

import org.example.model.Friend;
import org.example.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FriendDAO {

    public void addFriend(Friend friend) {
        String sql = "INSERT INTO friends (name, email, phone) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, friend.getName());
            stmt.setString(2, friend.getEmail());
            stmt.setString(3, friend.getPhone());
            stmt.executeUpdate();
            System.out.println("Friend added!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Friend> getAllFriends() {
        List<Friend> friends = new ArrayList<>();
        String sql = "SELECT * FROM friends";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Friend f = new Friend(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone")
                );
                friends.add(f);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return friends;
    }

    public void updateFriend(Friend friend) {
        String sql = "UPDATE friends SET name=?, email=?, phone=? WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, friend.getName());
            stmt.setString(2, friend.getEmail());
            stmt.setString(3, friend.getPhone());
            stmt.setInt(4, friend.getId());
            stmt.executeUpdate();
            System.out.println("Friend updated!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteFriend(int id) {
        String sql = "DELETE FROM friends WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Friend deleted!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
