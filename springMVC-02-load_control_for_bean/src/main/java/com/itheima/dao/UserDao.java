package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Insert;

/**
 * @author Mendy
 * @create 2023-06-27 14:07
 */

public interface UserDao {
    @Insert("insert into  tbl_user(name,age)values(#{name},#{age})")
    public void save(User user);
}

