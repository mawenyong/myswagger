package com.myswagger.service.Imp;

import com.myswagger.dao.RoleMapper;
import com.myswagger.model.Role;
import com.myswagger.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 编写者：
 * 编写时间：
 * 类模块描述：
 */
@Service
public class RoleServiceImp  implements RoleService{

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role selectByPrimaryKey(Integer rid) {
        return roleMapper.selectByPrimaryKey(rid);
    }
}
