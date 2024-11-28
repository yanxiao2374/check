package com.universe.check.mp;


import com.universe.check.dao.SysUserMapper;
import com.universe.check.model.SysUser ;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SysUserMapperTest {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    void testInsert() {
        SysUser sysUser = new SysUser();
        sysUser.setId(5L);
        sysUser.setName("Lucy");
        sysUser.setPassword("123");
        sysUser.setNickName("xx");

        sysUserMapper.insert(sysUser);
    }

//    @Test
//    void testSelectById() {
//        User user = userMapper.queryUserById(5L);
//        System.out.println("user = " + user);
//    }
//
//
//    @Test
//    void testQueryByIds() {
//        List<User> users = userMapper.queryUserByIds(List.of(1L, 2L, 3L, 4L));
//        users.forEach(System.out::println);
//    }
//
//    @Test
//    void testUpdateById() {
//        User user = new User();
//        user.setId(5L);
//        user.setBalance(20000);
//        userMapper.updateUser(user);
//    }
//
//    @Test
//    void testDeleteUser() {
//        userMapper.deleteUser(5L);
//    }
}