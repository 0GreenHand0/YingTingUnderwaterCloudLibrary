package com.tang.tangpicture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tang.tangpicture.domain.picture.entity.Picture;
import com.tang.tangpicture.domain.picture.repository.PictureRepository;
import com.tang.tangpicture.infrastructure.mapper.PictureMapper;
import org.springframework.stereotype.Service;

@Service
public class PictureRepositoryImpl extends ServiceImpl<PictureMapper, Picture> implements PictureRepository {
}
