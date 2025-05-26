package com.yupi.tangpicturebacken.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.tangpicturebacken.model.dto.space.SpaceAddRequest;
import com.yupi.tangpicturebacken.model.dto.space.SpaceQueryRequest;
import com.yupi.tangpicturebacken.model.dto.spaceuser.SpaceUserAddRequest;
import com.yupi.tangpicturebacken.model.dto.spaceuser.SpaceUserQueryRequest;
import com.yupi.tangpicturebacken.model.entity.Space;
import com.yupi.tangpicturebacken.model.entity.SpaceUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.tangpicturebacken.model.entity.User;
import com.yupi.tangpicturebacken.model.vo.SpaceUserVO;
import com.yupi.tangpicturebacken.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author dell
* @description 针对表【space_user(空间用户关联)】的数据库操作Service
* @createDate 2025-04-21 20:40:04
*/
public interface SpaceUserService extends IService<SpaceUser> {
    /**
     * 创建空间
     */
    long addSpaceUser(SpaceUserAddRequest spaceAddRequest);
    /**
     * 校验空间数据的办法
     * @param spaceUser
     * @param add
     */
    void validSpaceUser(SpaceUser spaceUser, boolean add);
    /**
     * 获取查询对象
     * @param spaceUserQueryRequest
     * @return
     */
    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);

    /**
     * 获取包装类
     * @param spaceUser
     * @param request
     * @return
     */
    SpaceUserVO getSpaceUserVO(SpaceUser spaceUser, HttpServletRequest request);

    /**
     * 获取包装类（分页）
     * @return
     */
    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);

}
