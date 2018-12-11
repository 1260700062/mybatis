package com.example.mybatis.mapper;

import com.example.mybatis.pojo.RolePermission;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}