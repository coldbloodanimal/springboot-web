package com.example.springbootweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@RestController
public class IndexController {

    @RequestMapping("hi")
    public Date hi(){
        return Calendar.getInstance().getTime();
    }
}
