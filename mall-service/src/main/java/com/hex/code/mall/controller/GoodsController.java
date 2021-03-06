package com.hex.code.mall.controller;

import com.hex.code.mall.model.Goods;
import com.hex.code.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: codeyung  E-mail:yjc199308@gmail.com
 * @date: 2019-05-10.13:28
 */

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    @GetMapping("/goods")
    public List<Goods> get() {
        return goodsService.getGoods();
    }


    @GetMapping("/goods/{goodsId}")
    public Goods get(@PathVariable("goodsId") long goodsId) {
        return goodsService.get(goodsId);
    }


    @PutMapping("/goods/{goodsId}/stock")
    public Boolean updateStock(@PathVariable("goodsId") long goodsId) {
        return goodsService.updateStock(goodsId) > 0 ? true : false;
    }

    @PostMapping("/goods")
    public Goods get(@RequestBody Goods goods) {
        return goodsService.add(goods);
    }


}
