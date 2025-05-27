package com.yupi.tangpicture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.tangpicture.domain.space.entity.SpaceUser;
import com.yupi.tangpicture.domain.space.repository.SpaceUserRepository;
import com.yupi.tangpicture.infrastructure.mapper.SpaceUserMapper;
import org.springframework.stereotype.Service;

@Service
public class SpaceUserRepositoryImpl extends ServiceImpl<SpaceUserMapper, SpaceUser> implements SpaceUserRepository {
}
