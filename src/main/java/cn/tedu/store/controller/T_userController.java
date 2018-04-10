package cn.tedu.store.controller;

import cn.tedu.store.dao.T_userDao;
import cn.tedu.store.domain.T_user;
import cn.tedu.store.service.T_userService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "用户管理相关接口")
@RestController
@RequestMapping("/user")
public class T_userController {

    @Autowired
    private T_userDao t_userdao;

    @Autowired
    private T_userService service;

    @ApiOperation(value = "插入用户")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public void insertUser(@RequestBody T_user user){
         service.register(user);
    }

    @ApiOperation(value="查询用户名存不存在")
    @RequestMapping(value="/checkusername",method=RequestMethod.GET)
    public String checkusername(@RequestBody String username){
        return service.checkUsername(username);

    }
    @ApiOperation(value="查询电话号码是否存在")
    @RequestMapping(value="/checkphone",method=RequestMethod.GET)
    public String checkphone(@RequestBody String phone){
        return service.checkPhone(phone);

    }
    @ApiOperation(value="查询邮箱是否存在")
    @RequestMapping(value="/checkemail",method=RequestMethod.GET)
    public String checkemail(@RequestBody String email){
        return service.checkEmail(email);
    }
    @ApiOperation(value="修改密码")
    @RequestMapping(value="/changepassword",method=RequestMethod.PUT)
    public String changepassword(@RequestBody Integer id,@RequestBody String oldPassword,@RequestBody String newPassword){
        return service.changePassword(id,oldPassword,newPassword);
    }

    @ApiOperation(value="修改个人信息")
    @RequestMapping(value="/updateperson",method=RequestMethod.PUT)
    public String changeperson(@RequestBody Integer id,
                               @RequestBody String username,
                               @RequestBody Integer gender,
                               @RequestBody String phone,
                               @RequestBody String email){
        return service.updatePerson(id,username,gender,phone,email);
    }
    @ApiOperation(value="登录")
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public T_user login(@RequestBody String username,@RequestBody String password){
        return service.login(username,password);
    }
    @ApiOperation(value="删除用户")
    @RequestMapping(value="/delete",method=RequestMethod.DELETE)
    public String deleteperson(Integer id){
       return service.deletePerson(id);
    }
}
