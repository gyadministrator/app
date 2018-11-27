package com.cloudforcode.app.service;

import com.cloudforcode.app.entity.UserEntity;

/**
 * @author gaoyun
 * @version 1.0
 * @date 2018/11/27
 * @email 1984629668@qq.com
 * @description
 */
public interface UserService extends BaseService<UserEntity, String> {
    void update(UserEntity userEntity);
}
