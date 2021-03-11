package com.AdSpy.controller;

import com.AdSpy.entity.User;
import com.AdSpy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/user")
public class IndexController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public String findAll(Model model){
        System.out.println("查询所有账户信息...");

        //调用service对象
        List<User> userList =  userService.findAll();
        for(User user:userList){
            System.out.println(user.toString());
        }
        model.addAttribute("list", userList);
        return "list";
    }
    /*
    @Resource
    private UserServiceImpl usersService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loginView(){
        return "loginView";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@ModelAttribute("username") String username, @ModelAttribute("password") String password){
        Users user = usersService.getUsersByUsername(username);
        if(user != null && user.getPassword().equals(password))
            return "index";
        return "loginView";
    }*/

}
