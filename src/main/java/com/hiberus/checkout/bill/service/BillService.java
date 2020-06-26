package com.hiberus.checkout.bill.service;

import javax.validation.Valid;

import com.hiberus.checkout.bill.dto.Products;

public interface BillService {

	Double putTotal(@Valid Products request);

}
