package com.yupi.tangpicture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.tangpicture.domain.picture.entity.Picture;
import com.yupi.tangpicture.domain.picture.repository.PictureRepository;
import com.yupi.tangpicture.infrastructure.mapper.PictureMapper;
import org.springframework.stereotype.Service;

@Service
public class PictureRepositoryImpl extends ServiceImpl<PictureMapper, Picture> implements PictureRepository {
}
