package com.hiberus.checkout.bill.service.impl;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.hiberus.checkout.bill.dto.Products;
import com.hiberus.checkout.bill.service.BillService;

@Service
public class BillServiceImpl implements BillService {

	@Override
	public Double putTotal(@Valid Products products) {
		return products.getProducts().stream().map(product -> product.getQuantity() * product.getPrice()).reduce(0.0,
				(a, b) -> a + b);
	}

}
