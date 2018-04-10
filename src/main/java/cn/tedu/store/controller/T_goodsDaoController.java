package cn.tedu.store.controller;

import cn.tedu.store.dao.T_goodsDao;
import cn.tedu.store.domain.T_goods;
import cn.tedu.store.service.T_goodsDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Api(value = "商品展示相关接口")
@RestController
@RequestMapping("/goods")
public class T_goodsDaoController {
    @Autowired
    private T_goodsDao goodsDao;
    @Autowired
    private T_goodsDaoService goodsdaoservice;

    @ApiOperation(value="商品详情")
    @RequestMapping(value="/listall",method=RequestMethod.GET)
    public List goodlistall(){
        return goodsdaoservice.list();
    }

    @ApiOperation(value="商品分类")
    @RequestMapping(value="/listtype",method=RequestMethod.GET)
    public List goodlisttype(@RequestBody String item_type){
       return goodsdaoservice.selectType(item_type);
    }

    @ApiOperation(value="商品展示")
    @RequestMapping(value="/listid",method=RequestMethod.GET)
    public T_goods goodlistid(String id){
        return goodsdaoservice.slectId(id);
    }

}
