package com.huisi.service.impl;

import com.huisi.dao.UserMapper;
import com.huisi.model.UserBo;
import com.huisi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xuhan on 2017/12/8.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public int insertBo_USER(UserBo userBo) {
        return this.userMapper.insert(userBo);
    }

    public String selectBo_USER(String userName) {
        return this.userMapper.selectBo(userName);
    }
}
