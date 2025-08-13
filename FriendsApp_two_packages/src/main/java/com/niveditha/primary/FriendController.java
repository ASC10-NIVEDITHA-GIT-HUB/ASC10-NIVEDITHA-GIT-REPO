package com.niveditha.primary;

import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/friends")
public class FriendController {
    private final FriendService service;

    public FriendController(FriendService service) {
        this.service = service;
    }

    @GetMapping
    public List<Friend> getFriends() {
        return service.getAllFriends();
    }

    @PostMapping
    public Friend addFriend(@Valid @RequestBody Friend friend) {
        return service.addFriend(friend);
    }

    @PutMapping("/{id}")
    public Friend updateFriend(@PathVariable Long id, @Valid @RequestBody Friend friend) {
        return service.updateFriend(id, friend);
    }

    @DeleteMapping("/{id}")
    public void deleteFriend(@PathVariable Long id) {
        service.deleteFriend(id);
    }
}
