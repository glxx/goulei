﻿package cn.itsource.goulei.controller;




import cn.itsource.goulei.Employee;
import cn.itsource.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    // restful:地址尽量不用动词:  获取一个员工: localhost:8001/employee/getById?id
    // @RequestBody 把请求的body中的数据,springmvc的原理封装进去
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee) {

        //本来应该获取到用户信息,去和数据库对比:我这里只是模拟:
        if("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMsg("登录成功");
        }else{
            return AjaxResult.me().setSuccess(false).setMsg("登录失败1111");
            System.out.println("来啊，快点，等你666666666");
        }

    }


}
