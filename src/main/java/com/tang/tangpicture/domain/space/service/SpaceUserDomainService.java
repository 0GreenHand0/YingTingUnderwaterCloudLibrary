package com.tang.tangpicture.domain.space.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tang.tangpicture.domain.space.entity.SpaceUser;
import com.tang.tangpicture.interfaces.dto.spaceuser.SpaceUserQueryRequest;

/**
* @author dell
* @description 针对表【space_user(空间用户关联)】的数据库操作Service
* @createDate 2025-04-21 20:40:04
*/
public interface SpaceUserDomainService extends IService<SpaceUser> {

    /**
     * 获取查询对象
     * @param spaceUserQueryRequest
     * @return
     */
    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);


}
