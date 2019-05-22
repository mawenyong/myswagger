package com.myswagger.dao;

import com.myswagger.model.Role;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper {

    Role selectByPrimaryKey(Integer rid);

}