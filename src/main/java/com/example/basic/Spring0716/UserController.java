package com.example.basic.Spring0716;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers(){
        return null;
    }
    @PostMapping
    public User createUser(@RequestBody User user){
        return null;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return null;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") Long id, @RequestBody User UpdateUser){
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteUset(@PathVariable("id") Long id){
        // 사용자 삭제 메서드
    }
}
