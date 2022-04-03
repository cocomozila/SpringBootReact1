package com.seyun.me.yun;

import dao.MemberDAO;
import dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mybatisservice")
public class MemberServiceImpl implements MemberService {

    @Autowired
    @Qualifier("mybatisdao")
    MemberDAO dao;

    @Override
    public List<MemberDTO> memberlist() {
        return null;
    }
}
