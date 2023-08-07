package com.emir.controller;


/*
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    @GetMapping(path = "/message/{message}")
    public String getMessage(@PathVariable String message){
        return "Your message is : "+message;
    }
}
 */


/*
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")

public class MyController{
    @GetMapping("/message")
    public String getMyMesage(@RequestParam String message){
        return "Your message is : " + message;
    }
}
 */


/*
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class MyController{

    @GetMapping({"/message1","/message1{message}"})
    public String getMyMessageWithVariable(@PathVariable(name = "message", required = false) String message){
        return "Your message is : " + message;
    }

    @GetMapping("/message2")
    public String getMyMessageWithParam(@RequestParam(name = "message", required = false, defaultValue  ="my default message") String message){
        return "Your message is : " + message;
    }
}
 */

/*
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.emir.model.User;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController{

    @PostMapping("users")
    public User saveUser(@RequestBody User user){
        System.out.println("User saved!");
        user.setPassword("");
        return user;
    }

    @PostMapping("users-all")
    public List<User> saveAllUser(@RequestBody List<User> users){
        System.out.println("All users saved!");
        users.forEach(user -> user.setPassword(""));
        return users;
    }
}
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController{
    @GetMapping("/header")
    public String getHeader(@RequestHeader("My-Header") String myHeader){
        return "Your header is : " +myHeader;
    }
}




