package com.yupi.tangpicture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.tangpicture.domain.space.entity.Space;
import com.yupi.tangpicture.domain.space.repository.SpaceRepository;
import com.yupi.tangpicture.infrastructure.mapper.SpaceMapper;
import org.springframework.stereotype.Service;

@Service
public class SpaceRepositoryImpl extends ServiceImpl<SpaceMapper, Space> implements SpaceRepository {
}
