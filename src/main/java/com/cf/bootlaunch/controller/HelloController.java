package com.cf.bootlaunch.controller;

import com.cf.bootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j

@RestController

public class HelloController {
   // private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public Article hello(){
//        Article article = new Article(1L,"cf");
//        article.setAuthor("陳姥爷");
        Article article1 = Article.builder().id(5).author("莫言").build();

        log.info("测试一下"+article1);
        return article1;
    }
}
