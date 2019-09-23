package com.guoguo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.guoguo.model.Order;
import com.guoguo.model.User;
import com.guoguo.service.OrderService;
import com.guoguo.service.UserService;


@Component
@Service(version = "1.0.0", timeout = 3000,interfaceClass = OrderService.class)
public class OrderServiceImpl implements OrderService {
	
	private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
	
	public List<Order> getOrders() {
		List<Order> list = new ArrayList<Order>();
		Order o1 = new Order();
		o1.setId(1);
		o1.setName("鼠标");
		o1.setQuantity(2);
		o1.setAmount(100);
		
		Order o2 = new Order();
		o2.setId(2);
		o2.setName("pen");
		o2.setQuantity(10);
		o2.setAmount(50);

		list.add(o1);
		list.add(o2);
		return list;
	}

}
