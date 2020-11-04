package com.koreait.day01.controller;

import com.koreait.day01.model.MultiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") //localhost:9090/api   주소랑 연결시키겠다.
public class GetController {

    // localhost:9090/api/getMethod
    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")
    public String getRequest(){
        return "getMethod 호출";
    }

    // localhost:9090/api/getParameter?id=apple&pass=1234
    @GetMapping("/getParameter")// get방식만 받음
    public String getPara(@RequestParam String id, @RequestParam String pass){
        System.out.println("id : " + id);
        System.out.println("pass : " + pass);
        return "getPara() 호출";
    }
    /*
        id
        name
        email
        age
    */
    // localhost:9090/api/getMultiParameter?id=apple&name=김사과&email=apple@apple.com&age=20
    @GetMapping("/getMultiParameter")
//    public String getMultiPra(
//                @RequestParam String id,
//                @RequestParam String name,
//                @RequestParam String email,
//                @RequestParam int age
//                ){
//        System.out.println("id : " + id);
//        System.out.println("name : " + name);
//        System.out.println("email : " + email);
//        System.out.println("age : " + age);
//        return "ok";
//    }
    public MultiParam getMultiParam(MultiParam multiParam){
        System.out.println("id : " + multiParam.getId());
        System.out.println("name : " + multiParam.getName());
        System.out.println("email : " + multiParam.getEmail());
        System.out.println("age : " + multiParam.getAge());
        return multiParam;
    }
}
