package com.mfs.sms.controller;

import com.mfs.sms.pojo.Number;
import com.mfs.sms.pojo.Result;
import com.mfs.sms.pojo.Type;
import com.mfs.sms.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/number")
public class NumberController {
    @Autowired
    private NumberService numberService;

    @RequestMapping("/add")
    //@CrossOrigin(origins = {"*"},allowCredentials = "true")
    public Result addNumber(@RequestBody Number number, HttpServletRequest request) {
        //System.out.println(number);
        try {
            return numberService.addNumber(number,request);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(3,"服务器异常",null,null);
        }
    }
    @RequestMapping("/delete")
    //@CrossOrigin(origins = {"*"},allowCredentials = "true")
    public Result deleteNumber(@RequestBody Number number,HttpServletRequest request) {
        //System.out.println(number);
        try {
            return numberService.deleteNumber(number,request);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(3,"服务器异常",null,null);
        }
    }
    @RequestMapping("/edit")
    //@CrossOrigin(origins = {"*"},allowCredentials = "true")
    public Result editNumber(@RequestBody Number number,HttpServletRequest request) {
        //System.out.println(number);
        try {
            return numberService.editNumber(number,request);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(3,"服务器异常",null,null);
        }
    }
    @RequestMapping("/list")
    //@CrossOrigin(origins = {"*"},allowCredentials = "true")
    public Result listNumber(@RequestBody Number number, HttpServletRequest request) {
        //System.out.println(number);
        try {
            return numberService.listNumber(number,request);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(3,"服务器异常",null,null);
        }
    }
}
