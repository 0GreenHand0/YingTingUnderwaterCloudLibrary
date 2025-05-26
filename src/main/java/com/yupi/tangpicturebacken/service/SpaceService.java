package com.yupi.tangpicturebacken.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.tangpicturebacken.model.dto.space.SpaceAddRequest;
import com.yupi.tangpicturebacken.model.dto.space.SpaceQueryRequest;
import com.yupi.tangpicturebacken.model.entity.Space;
import com.yupi.tangpicturebacken.model.entity.User;
import com.yupi.tangpicturebacken.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author dell
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2025-03-05 19:25:01
*/
public interface SpaceService extends IService<Space> {
    /**
     * 创建空间
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);
    /**
     * 校验空间数据的办法
     * @param space 
     * @param add
     */
    void validSpace(Space space, boolean add);
    /**
     * 获取查询对象
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    /**
     * 获取包装类
     * @param space
     * @param request
     * @return
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 获取包装类（分页）
     * @param spacePage
     * @param request
     * @return
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    /**
     * 在创建或者更新空间时，需要根据空间级别自动填充限额数据
     * @param space
     */
    void fillSpaceBySpaceLevel(Space space);

    /**
     * 校验空间权限
     * @param loginUser
     * @param space
     */
    void checkSpaceAuth(User loginUser, Space space);
}
