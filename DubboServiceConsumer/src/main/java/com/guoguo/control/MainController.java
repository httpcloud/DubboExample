package com.guoguo.control;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.dubbo.config.annotation.Reference;
import com.guoguo.model.Order;
import com.guoguo.service.OrderService;
import com.guoguo.service.UserService;

@RestController
@RequestMapping("/")
public class MainController { 
	
	/*
	@Reference(url = "branchUrl")
	DemoService branchService;
	
    //timeout 可以不指定，但是version一定要指定 不然会找不到服务 直连需要加url="dubbo://localhost:20880"
    @Reference(version = "1.0.0")
	DemoService masterService;
    */
    
    @Reference(version = "1.0.0")
	UserService userService;
    
    @Reference(version = "1.0.0")
	OrderService orderService;
	
	
      @RequestMapping("/")   
      @ResponseBody  
      String home() {
        System.out.println("springboot项目启动成功!");
        return "springboot项目启动成功!";
      }
     
      @RequestMapping(value="/dubbo/say/{name}")
      public String sayHello(@PathVariable("name") String name){
		String str = userService.sayHello(name);    
		return str;
      }
      
      @RequestMapping(value="/order")
      @ResponseBody
      public String getOrders(){
		List<Order> list = orderService.getOrders();
		list.forEach(s->System.out.println(s.getName()));
		return JSON.toJSONString(list);		
      }
      
      
      
      
      @RequestMapping("/client")   
      @ResponseBody  
      String client() {
    	  /*
    	  static final String branchUrl = "dubbo://127.0.0.1:20881";
    	  static final String masterUrl = "dubbo://127.0.0.1:20880";
    		
    		

    		
    	    @RequestMapping("branch")
    	    public String branch() {
    	    	System.out.println("-----dubbo服务测试方法-----同时调用多个dubbo服务测试-----");
    	    	String re = branchService.branchTest("consumer 请求服务");
    	    	return re;
    	    }
    	    
    	    @RequestMapping("master")
    	    public String master() {
    	    	System.out.println("-----dubbo服务测试方法-----同时调用多个dubbo服务测试-----");
    	    	String re = masterService.masterTest("consumer 请求服务");
    	    	return re;
    	    }
    	    */
    	  
    	    return "client test";


      }
}
