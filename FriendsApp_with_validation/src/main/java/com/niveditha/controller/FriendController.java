package com.niveditha.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.niveditha.entity.Friend;
import com.niveditha.service.FriendService;
import org.springframework.validation.BindingResult;

@RestController
@RequestMapping("/friends")
public class FriendController {

    private final FriendService friendService;
    public FriendController(FriendService friendService) {
        this.friendService = friendService;
    }

    @PostMapping
    public ResponseEntity<?> addFriend(@Valid @RequestBody Friend friend, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }
        return ResponseEntity.ok(friendService.saveFriend(friend));
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
    public ResponseEntity<?> updateFriend(
            @PathVariable int id, @Valid @RequestBody Friend friend, BindingResult result
    ) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }
        return ResponseEntity.ok(friendService.updateFriend(id, friend));
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
