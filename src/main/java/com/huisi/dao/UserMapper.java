package com.huisi.dao;

import com.huisi.model.UserBo;
import org.springframework.stereotype.Service;

/**
 * Created by xuhan on 2017/12/8.
 */
public interface UserMapper {
    int insert(UserBo userBo);
    String selectBo(String userName);
}
