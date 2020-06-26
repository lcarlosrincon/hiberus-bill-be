package com.hiberus.checkout.bill.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiberus.checkout.bill.dto.ObjectResponseSuccess;
import com.hiberus.checkout.bill.dto.Products;
import com.hiberus.checkout.bill.dto.ProductsResponse;
import com.hiberus.checkout.bill.service.BillService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.log4j.Log4j2;

@RequestMapping(path = "/bill")
@RestController
@Log4j2
public class BillController {

	private BillService billService;

	@Operation(summary = "Bills the total cost")
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ObjectResponseSuccess<ProductsResponse>> insert(@RequestBody @Valid Products request) {
		Double total = this.billService.putTotal(request);
		log.debug("Total calculated:" + total);
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ObjectResponseSuccess<>(ProductsResponse.builder().order(request).total(total).build()));
	}

	public BillService getBillService() {
		return billService;
	}

	@Autowired
	public void setBillService(BillService billService) {
		this.billService = billService;
	}
}
