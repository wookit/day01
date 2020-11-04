package com.koreait.day01.controller;


import com.koreait.day01.model.MultiParam;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/api")
public class PostController {
    @PostMapping(value = "/postMethod")
    //localhost:9090/api/postMethod
    public MultiParam postMethod(@RequestBody MultiParam multiParam){

        return multiParam;
    }

    @PutMapping("/putMethod")
    public void put(){
        System.out.println("putMethod 호출");

    }

    @PatchMapping("/patchMethod")
    public void patch(){
        System.out.println("patchMethod 호출");
    }

    @DeleteMapping("/deleteMethod")
    public void delect(){
        System.out.println("deleteMethod 호출");
        System.out.println("세번째 수정");
    }
}
