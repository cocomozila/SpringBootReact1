package com.seyun.me.yun;

import dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class AppController {

    @Autowired
    @Qualifier("mybatisservice")
    MemberService service;

    @GetMapping("/post")
    @ResponseBody
    public Post plus(Model model) {

        Post post = new Post("1", "1", "안녕하세요", "본문내용입니다zz");

        return post;
    }

    @PostMapping("/login")
    @ResponseBody
    public List<MemberDTO> searchAll(Model model) {
        return null;
    }
}
