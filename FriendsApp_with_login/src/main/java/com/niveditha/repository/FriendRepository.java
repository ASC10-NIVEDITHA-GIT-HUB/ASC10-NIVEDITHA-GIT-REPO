package com.niveditha.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.niveditha.entity.Friend;

public interface FriendRepository extends JpaRepository<Friend, Integer> {
    List<Friend> findByNameContainingIgnoreCase(String name);
}

