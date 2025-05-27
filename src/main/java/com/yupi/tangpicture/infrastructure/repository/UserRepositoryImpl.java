package com.yupi.tangpicture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.tangpicture.domain.user.entity.User;
import com.yupi.tangpicture.domain.user.repository.UserRepository;
import com.yupi.tangpicture.infrastructure.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * 用户仓储实现
 */
@Service
public class UserRepositoryImpl extends ServiceImpl<UserMapper, User> implements UserRepository {
}
