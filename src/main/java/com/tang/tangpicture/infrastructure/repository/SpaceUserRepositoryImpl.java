package com.tang.tangpicture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tang.tangpicture.domain.space.entity.SpaceUser;
import com.tang.tangpicture.domain.space.repository.SpaceUserRepository;
import com.tang.tangpicture.infrastructure.mapper.SpaceUserMapper;
import org.springframework.stereotype.Service;

@Service
public class SpaceUserRepositoryImpl extends ServiceImpl<SpaceUserMapper, SpaceUser> implements SpaceUserRepository {
}
