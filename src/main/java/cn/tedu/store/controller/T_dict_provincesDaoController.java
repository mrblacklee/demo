package cn.tedu.store.controller;

import cn.tedu.store.dao.T_dict_provincesDao;
import cn.tedu.store.domain.T_dict_provinces;
import cn.tedu.store.service.T_dict_provincesDaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "地址管理相关接口")
@RestController
@RequestMapping("/adress")
public class T_dict_provincesDaoController {
    @Autowired
    private T_dict_provincesDao t_dict_provincesDao;
    @Autowired
    private T_dict_provincesDaoService provincesdaoservice;

    @ApiOperation(value="查询所有省地址")
    @RequestMapping(value="/provincelist",method=RequestMethod.GET)
    public List list(){

        return provincesdaoservice.select();
    }

    @ApiOperation(value="选取省份")
    @RequestMapping(value="/provinceinsert",method=RequestMethod.POST)
    public String insert(@RequestBody T_dict_provinces provinces){
        return provincesdaoservice.insert(provinces);
    }

    @ApiOperation(value="修改省份")
    @RequestMapping(value="/provinceupdate",method=RequestMethod.PUT)
    public String update(@RequestBody Integer id,@RequestBody String provinceCode,@RequestBody String provinceName){
        return provincesdaoservice.update(id,provinceCode,provinceName);
    }

    @ApiOperation(value="删除省份")
    @RequestMapping(value="provincedelete",method=RequestMethod.DELETE)
    public String delete(@RequestBody Integer id){
       return provincesdaoservice.delete(id);
    }
}
