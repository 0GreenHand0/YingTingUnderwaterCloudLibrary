package com.tang.tangpicture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tang.tangpicture.domain.space.entity.Space;
import com.tang.tangpicture.domain.space.repository.SpaceRepository;
import com.tang.tangpicture.infrastructure.mapper.SpaceMapper;
import org.springframework.stereotype.Service;

@Service
public class SpaceRepositoryImpl extends ServiceImpl<SpaceMapper, Space> implements SpaceRepository {
}
