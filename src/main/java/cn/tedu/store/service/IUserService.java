package cn.tedu.store.service;

import cn.tedu.store.domain.T_user;

public interface IUserService {
    /**
     * 用户注册
     * @param user
     */
    String register(T_user user);


    /**
     * 验证用户名是否存在
     * @param username
     * @return
     */
    String checkUsername(String username);

    /**
     * 验证邮箱
     * @param email
     * @return
     */
    String checkEmail(String email);

    /**
     * 验证电话号码
     * @param phone
     * @return
     */
    String checkPhone(String phone);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    T_user login(String username,String password);
    /**
     * 修改密码
     * @param id
     * @param oldPassword
     * @param newPassword
     */
    String changePassword(Integer id,
                        String oldPassword,
                        String newPassword);
    /**
     * 修改用户基本信息
     * @param id
     * @param username
     * @param gender
     * @param phone
     * @param email
     */
    String updatePerson(Integer id,
                      String username,
                      Integer gender,
                      String phone,
                      String email);
    String deletePerson(Integer id);
}
