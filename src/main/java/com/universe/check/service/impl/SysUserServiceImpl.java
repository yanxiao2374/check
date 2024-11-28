package com.universe.check.service.impl;

import com.universe.check.model.SysUser;
import com.universe.check.dao.SysUserMapper;
import com.universe.check.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户管理 服务实现类
 * </p>
 *
 * @author mrf
 * @since 2024-11-27
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public List<SysUser> getAllUsers() {

        return sysUserMapper.selectList(null);
    }

}
