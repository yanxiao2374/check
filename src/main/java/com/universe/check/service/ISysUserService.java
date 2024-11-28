package com.universe.check.service;

import com.universe.check.model.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户管理 服务类
 * </p>
 *
 * @author mrf
 * @since 2024-11-27
 */
public interface ISysUserService extends IService<SysUser> {
    List<SysUser> getAllUsers();
}
