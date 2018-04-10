package cn.tedu.store.controller;

import cn.tedu.store.dao.T_addressDao;
import cn.tedu.store.domain.T_address;
import cn.tedu.store.service.T_addressDaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(value="购物车相关接口")
@RestController
@RequestMapping("/address")
public class T_addressDaoController {
    @Autowired(required = false)
    private  T_addressDao t_addressDao;
    @Autowired
    private T_addressDaoService addressdaoservice;

    @ApiOperation(value="显示购物车")
    @RequestMapping(value="/list")
    public List listall(){
        return addressdaoservice.list();
    }

    @ApiOperation(value="添加到购物车")
    @RequestMapping(value="/add")
    public String listid(@RequestBody T_address address){
        return addressdaoservice.insert(address);
    }

    @ApiOperation(value="删除指定id购物车商品")
    @RequestMapping(value="/delete")
    public String detele(@RequestBody Integer id){
        return addressdaoservice.detele(id);
    }
}
