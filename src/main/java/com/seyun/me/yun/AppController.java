package com.seyun.me.yun;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    @GetMapping("/post")
    @ResponseBody
    public Post plus(Model model) {

        Post post = new Post("1", "1", "안녕하세요", "본문내용입니다zz");

        return post;
    }
}
