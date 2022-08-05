package com.example.thymeleaf_test.controller;

import com.example.thymeleaf_test.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafExController {

    @GetMapping(value = "/ex02")
    public String thymeleafExample02(Model model){
        Item item = new Item();
        item.setItemDetail("상품 상세 설명");
        item.setItemNm("테스트 상품");
        item.setPrice(10000);
        item.setRegTime(LocalDateTime.now());

        model.addAttribute("item",item);
        return "thymeleaf02";
    }
}
