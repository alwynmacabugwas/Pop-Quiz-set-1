package com.uap.it1311l.transactionsapi.transactionsapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.uap.it1311l.transactionsapi.transactionsapi.model.CustomerInfo;
import com.uap.it1311l.transactionsapi.transactionsapi.model.ItemInfo;

@Mapper
public interface ShopMybatisRepository {
	@Insert("INSERT INTO transactions(customer_name, address) VALUES (#{customerName}, #{customerAddress})")
	public int insertCustomer(CustomerInfo customer);
	
	@Insert("INSERT INTO transaction_items(barcode, item_name, unit_price, quantity) VALUES (#{barcode}, #{itemName}, #{price}, #{quantity})")
	public int insertItem(List<ItemInfo> items);

}

