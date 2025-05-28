package com.tang.tangpicture.domain.space.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tang.tangpicture.domain.space.entity.Space;
import com.tang.tangpicture.domain.user.entity.User;
import com.tang.tangpicture.interfaces.dto.space.SpaceQueryRequest;

/**
* @author dell
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2025-03-05 19:25:01
*/
public interface SpaceDomainService extends IService<Space> {

    /**
     * 获取查询对象
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

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
