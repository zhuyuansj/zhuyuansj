package com.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    /**
     * 跳转到指定的jsp页面
     */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
