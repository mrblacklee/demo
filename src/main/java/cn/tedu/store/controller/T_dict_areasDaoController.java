package cn.tedu.store.controller;

import cn.tedu.store.dao.T_dict_areasDao;
import cn.tedu.store.domain.T_dict_areas;
import cn.tedu.store.service.T_dict_areasDaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController
@RequestMapping("/adress")
public class T_dict_areasDaoController {
    @Autowired
    private T_dict_areasDao t_dict_areasDao;
    @Autowired
    private T_dict_areasDaoService areasdaoservice;

    @ApiOperation(value="查询所有区的地址")
    @RequestMapping(value="/arealist",method= RequestMethod.GET)
    public List arealist(){
        return areasdaoservice.list();
    }

    @ApiOperation(value="选择区的地址")
    @RequestMapping(value="/areainsert",method=RequestMethod.POST)
    public String areainsert(@RequestBody T_dict_areas areas){
        return areasdaoservice.insert(areas);
    }

    @ApiOperation(value="修改区的地址")
    @RequestMapping(value="/areaupdate",method=RequestMethod.PUT)
    public String areaupdate(@RequestBody Integer id,@RequestBody String areaCode,@RequestBody String areaName){
       return areasdaoservice.update(id,areaCode,areaName);
    }

    @ApiOperation(value="删除区的地址")
    @RequestMapping(value="/areadetele",method=RequestMethod.DELETE)
    public String areadelete(@RequestBody Integer id){
        return areasdaoservice.delete(id);
    }
}
