package com.itheima.service.impl;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Mendy
 * @create 2023-06-27 14:07
 */


@Service
public class UserServiceImpl implements UserService {
    public void save(User user) {
        System.out.println("user service ...");
    }
}

