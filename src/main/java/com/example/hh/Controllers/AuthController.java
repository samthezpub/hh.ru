package com.example.hh.Controllers;

import com.example.hh.Entities.RoleEntity;
import com.example.hh.Entities.UserEntity;
import com.example.hh.Exceptions.NotValidTypeException;
import com.example.hh.Exceptions.RoleNotFoundException;
import com.example.hh.Services.impl.RoleServiceImpl;
import com.example.hh.Services.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private RoleServiceImpl roleService;

    @GetMapping("/signup")
    public String signUpPage(Model model) {
        model.addAttribute("user", new UserEntity());

        return "signup";
    }

    @PostMapping("/signup")
    public String register(@ModelAttribute UserEntity user, @RequestParam("type") String type) {
        System.out.println(user);


        try {
            RoleEntity role = roleService.findRoleByName(type);
            user.setRole(role);
        } catch (RoleNotFoundException e) {
            log.info("Пользователь " + user.getUsername() + " попытался зарегистрироваться с несуществующей ролью");
            return "redirect://400";
        }


        userService.addUser(user);

        return "redirect://login";
    }
}
