package com.bdqn.ServiceImpl;

import com.bdqn.Service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void show() {
        System.out.println("这是service");
    }
}
