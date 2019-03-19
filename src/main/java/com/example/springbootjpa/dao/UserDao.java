package com.example.springbootjpa.dao;

import com.example.springbootjpa.domain.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author silen
 * Date 2019/3/18
 * 用户服务数据接口
 */
@Repository
public interface UserDao extends JpaRepository<UserDO,Long> {

}
