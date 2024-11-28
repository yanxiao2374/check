package com.universe.check.controller;

import com.universe.check.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户管理 前端控制器
 * </p>
 *
 * @author mrf
 * @since 2024-11-27
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {
    @Autowired
    private ISysUserService IsysUserService;

    @GetMapping(value="/findAll")
    public Object findAll() {
        return IsysUserService.getAllUsers();
    }
}
