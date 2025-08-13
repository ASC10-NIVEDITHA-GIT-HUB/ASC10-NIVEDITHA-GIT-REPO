package com.niveditha.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.niveditha.entity.Friend;
import com.niveditha.service.FriendService;

@RestController
@RequestMapping("/friends")
public class FriendController {
    private final FriendService friendService;
    public FriendController(FriendService friendService) {
        this.friendService = friendService;
    }
    @PostMapping
    public Friend addFriend(@RequestBody Friend friend) {
        return friendService.saveFriend(friend);
    }
    @GetMapping
    public List<Friend> getAllFriends() {
        return friendService.getAllFriends();
    }
    @GetMapping("/{id}")
    public Friend getFriend(@PathVariable int id) {
        return friendService.getFriendById(id);
    }
    @PutMapping("/{id}")
    public Friend updateFriend(@PathVariable int id, @RequestBody Friend friend) {
        return friendService.updateFriend(id, friend);
    }
    @DeleteMapping("/{id}")
    public void deleteFriend(@PathVariable int id) {
        friendService.deleteFriend(id);
    }
    @GetMapping("/search")
    public List<Friend> searchFriends(@RequestParam String keyword) {
        return friendService.searchFriends(keyword);
    }
}
