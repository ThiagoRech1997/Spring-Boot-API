package br.edu.utfpr.tac.agroapi1.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.tac.agroapi1.dto.UserDTO;
import br.edu.utfpr.tac.agroapi1.model.User;
import br.edu.utfpr.tac.agroapi1.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> list(){
        return userRepository.findAll();
    }

    @PostMapping
    public User add(@RequestBody UserDTO userDTO){
        System.out.println(userDTO);

        User p = new User();
        BeanUtils.copyProperties(userDTO, p);

        LocalDateTime now = LocalDateTime.now(ZoneId.of("UTC"));

        p.setCreatedAt(now);
        p.setUpdatedAt(now);
        return userRepository.save(p);
    }
}
