package com.qf.mapper;

import com.qf.domain.SysPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


import java.util.List;

@Mapper
@Component
public interface SysPermissionRepository {

    List<SysPermission> selectPermissionByLoginName(String name);  //查找权限


}