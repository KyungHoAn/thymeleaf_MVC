# Thymeleaf 사용 servlet test

```
package com.example.thymeleaf_test.controller;

import com.example.thymeleaf_test.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @RequestMapping("/")
    public String mainView(){
        return "index";
    }

    @RequestMapping("/test")
    public String getMessage(Model model){
        model.addAttribute("testSTR","useThymeleaf!!!!");
        return "testView";
    }

    @RequestMapping("/member")
    public String getMember(Model model){
        Member member = new Member(1, "Kyungho","123456789");
        model.addAttribute("member",member);
        return "member";
    }

    //link 사용
    @RequestMapping("/link")
    public String linkView(){
        return "link";
    }

    //반복문 each 사용
    @RequestMapping("/list")
    public String getList(Model model){
        Member member1 = new Member(1,"An","010-1111-1111");
        Member member2 = new Member(2,"Kyung","010-2222-2222");
        Member member3 = new Member(3,"Ho","010-3333-3333");
        List<Member> members = new ArrayList();
        members.add(member1);
        members.add(member2);
        members.add(member3);
        model.addAttribute("memberList",members);
        return "listMember";
    }

}
```
