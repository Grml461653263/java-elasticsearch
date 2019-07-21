package com.my.controller;

import com.my.mapper.EsMapper;
import com.my.pojo.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("es")
public class ExController {

    @Autowired
    private EsMapper es;

    @GetMapping("add")
    public void addEs(){
        Like like = new Like();
        like.setId(100);
        like.setLikeTime(10);
        like.setBecauseOf("我也不知道为什么，就是很喜欢，想一直一直喜欢下去，陪她日出日落");
        like.setWant("娶她");
        es.save(like);
    }
    @GetMapping("query")
    @ResponseBody
    public Like query(){
      return   (Like)es.findAll();
    }
}
