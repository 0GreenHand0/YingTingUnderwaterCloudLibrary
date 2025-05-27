package com.yupi.tangpicture.application.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.tangpicture.infrastructure.common.DeleteRequest;
import com.yupi.tangpicture.interfaces.dto.user.UserLoginRequest;
import com.yupi.tangpicture.interfaces.dto.user.UserQueryRequest;
import com.yupi.tangpicture.domain.user.entity.User;
import com.yupi.tangpicture.interfaces.dto.user.UserRegisterRequest;
import com.yupi.tangpicture.interfaces.vo.user.LoginUserVO;
import com.yupi.tangpicture.interfaces.vo.user.UserVO;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Set;

/**
* @author dell
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-01-21 13:24:48
*/
public interface UserApplicationService {
    /**
     * 用户注册
     *
     * @return 新用户 id
     */
    @Transactional
    long userRegister(UserRegisterRequest userRegisterRequest);


    long addUser(User user);

    User getUserById(long id);

    UserVO getUserVOById(long id);

    boolean deleteUser(DeleteRequest deleteRequest);

    void updateUser(User user);

    Page<UserVO> listUserVOByPage(UserQueryRequest userQueryRequest);

    List<User> listByIds(Set<Long> userIdSet);


    /**
     * 用户登录
     *

     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(UserLoginRequest userLoginRequest, HttpServletRequest request);

    /**
     * 获取登录用户的信息，仅限于后端使用
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 获取脱敏后的登录用户信息
     * @param user
     * @return
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获得脱敏后的用户信息
     *
     * @param user
     * @return
     */
    UserVO getUserVO(User user);

    /**
     * 获得脱敏后的用户信息列表
     *
     * @param userList
     * @return 脱敏后的用户列表
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 用户注销
     */
    Boolean userLogout(HttpServletRequest request);

    /**
     * 获取查询条件
     * @param userQueryRequest
     * @return
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);


    String getEncryptPassword(String userPassword);
}


