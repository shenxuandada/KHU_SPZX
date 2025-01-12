package com.atguigu.spzx.manger.mapper;

import com.atguigu.spzx.model.entity.system.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: SysMenuMapper
 * Description:
 *
 * @Author Refactoring
 * Create 2024/8/6 下午5:55
 * Version 1.8
 */
@Mapper
public interface SysMenuMapper {

    //1 查询所有菜单,返回list集合
    List<SysMenu> findAll();

    //添加
    void save(SysMenu sysMenu);

    //菜单修改
    void update(SysMenu sysMenu);

    //根据当前菜单id,查询是否存在子菜单
    int selectCountById(Long id);

    //删除
    void delete(Long id);

    //根据userId查询可以操作菜单
    List<SysMenu> findMenusByUserId(Long userId);

    //获取当前添加菜单的父菜单
    SysMenu selectParentMenu(Long parentId);
}
