package com.niveditha.primary;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FriendService {
    private final FriendRepository repository;

    public FriendService(FriendRepository repository) {
        this.repository = repository;
    }

    public List<Friend> getAllFriends() {
        return repository.findAll();
    }

    public Friend addFriend(Friend friend) {
        return repository.save(friend);
    }

    public Friend updateFriend(Long id, Friend friend) {
        friend.setId(id);
        return repository.save(friend);
    }

    public void deleteFriend(Long id) {
        repository.deleteById(id);
    }
}
