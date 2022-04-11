package com.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Orders;
import com.repository.OrdersRepository;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	OrdersRepository ordersRepository;
	
	@Override
	public void addOrders(Orders orders) {
		ordersRepository.save(orders);
	}
	
	@Override
	public Orders findById(Integer id) {
		Optional<Orders> temp = ordersRepository.findById(id);
		if(temp.isPresent())
		{
			return temp.get();
		}
		return null;
	}

	@Override
	public List<Orders> findByOrderPurchaseDate(String orderPurchaseDate) {
		return ordersRepository.findByOrderPurchaseDate(orderPurchaseDate);
	}

	@Override
	public List<Orders> findAllOrders() {
		return ordersRepository.findAll();
	}

}
