package com.niveditha.service;

import java.util.List;
import com.niveditha.entity.Friend;

public interface FriendService {
    Friend saveFriend(Friend friend);
    Friend getFriendById(int id);
    List<Friend> getAllFriends();
    Friend updateFriend(int id, Friend friend);
    void deleteFriend(int id);
    List<Friend> searchFriends(String keyword);
}
