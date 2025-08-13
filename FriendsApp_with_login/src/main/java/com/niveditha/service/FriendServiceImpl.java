package com.niveditha.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.niveditha.entity.Friend;
import com.niveditha.repository.FriendRepository;

@Service
public class FriendServiceImpl implements FriendService {
    private final FriendRepository friendRepository;
    public FriendServiceImpl(FriendRepository friendRepository) {
        this.friendRepository = friendRepository;
    }
    public Friend saveFriend(Friend friend) { return friendRepository.save(friend); }
    public Friend getFriendById(int id) { return friendRepository.findById(id).orElse(null); }
    public List<Friend> getAllFriends() { return friendRepository.findAll(); }
    public Friend updateFriend(int id, Friend friend) {
        Friend existing = friendRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(friend.getName());
            existing.setEmail(friend.getEmail());
            existing.setPhone(friend.getPhone());
            existing.setAddress(friend.getAddress());
            return friendRepository.save(existing);
        }
        return null;
    }
    public void deleteFriend(int id) { friendRepository.deleteById(id); }
    public List<Friend> searchFriends(String keyword) { return friendRepository.findByNameContainingIgnoreCase(keyword); }
}

