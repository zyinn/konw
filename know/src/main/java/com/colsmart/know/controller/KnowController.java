package com.colsmart.know.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KnowController {
    @RequestMapping("/")
    public String fitsRepoAttrController() {
        return "index";
    }

    @RequestMapping("index")
    public String indexController() {
        return "index";
    }
}
