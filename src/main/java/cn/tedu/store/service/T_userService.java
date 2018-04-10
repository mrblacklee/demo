package cn.tedu.store.service;

import cn.tedu.store.dao.T_userDao;
import cn.tedu.store.domain.T_user;
import cn.tedu.store.service.ex.PasswordNotMatchException;
import cn.tedu.store.service.ex.UserNotFoundException;
import cn.tedu.store.service.ex.UsernameAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class T_userService implements IUserService{

    @Autowired
    private T_userDao t_userdao;

    public String register(T_user user){
        T_user user1=t_userdao.getUserByUsername(
                user.getUsername()
        );
        if(user1==null){
            t_userdao.insert(user);
        }else {
            throw new UsernameAlreadyExistException("用户名已存在，请重新输入");

        }
        return "插入成功";
    }



    public String checkUsername(String username){
        if(t_userdao.getUserByUsername(username)==null){
            return "用户名不存在";
        }else {
            return "用户名已存在";

        }
    }
    public String checkEmail(String email){
        if(t_userdao.getCountByEmail(email)==null){
            return "邮箱不存在";
        }else {
            return "邮箱不存在";
        }
    }
    public String checkPhone(String phone){
        if(t_userdao.getCountByPhone(phone)==null){
            return "电话不存在";
        }else {
            return "电话已存在";
        }

    }
    public T_user login(String username,String password){
        T_user user=t_userdao.getUserByUsername(username);
        if(user==null){
            throw new UserNotFoundException("用户名不存在");
        }else {
            if(user.getPassword().equals(password)){
                return user;
            }else {
                throw new PasswordNotMatchException("密码不存在");
            }
        }
    }
    public  String changePassword(Integer id,String oldPassword,String newPassword){
        T_user user=t_userdao.getUserById(id);
        if(user==null){
            throw new UserNotFoundException("用户不存在");

        }else {
            if(user.getPassword().equals(oldPassword)){
                T_user u=new T_user();
                u.setId(id);
                u.setPassword(newPassword);
                t_userdao.update(u);
                return "密码修改成功";
            }else {
                throw new PasswordNotMatchException("密码不匹配异常");

            }
        }

    }
    public String updatePerson(Integer id,
                             String username,
                             Integer gender,
                             String phone,
                             String email){
        T_user user=new T_user();
        T_user u1=t_userdao.getUserById(id);
        if(u1==null){
            throw new UserNotFoundException("用户不存在");
        }
        T_user u2=t_userdao.getUserByUsername(username);
                if(u2==null){
                    user.setUsername(username);
                }else {
                    if(u1.getUsername().equals(username)){

                    }else {
                        throw new UsernameAlreadyExistException("用户已存在");
                    }
                }
                user.setId(id);
                user.setGender(gender);
                user.setPhone(phone);
                user.setEmail(email);
        t_userdao.update(user);
        return "个人信息修改成功";
    }
    public String deletePerson(Integer id){
        if(t_userdao.deleteByPrimaryKey(id)==0){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }
}
