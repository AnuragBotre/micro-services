package com.trendcore.user.controller;

import com.trendcore.user.entity.User;
import com.trendcore.user.service.UserService;
import com.trendcore.user.vo.UserDepartmentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserRestController {

    @Autowired
    UserService userService;

    @GetMapping("/{userId}")
    public UserDepartmentVO getUserWithDepartment(@PathVariable Long userId){
        return Optional.ofNullable(userService.getUserWithDepartment(userId)).orElse(new UserDepartmentVO());
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }


}
