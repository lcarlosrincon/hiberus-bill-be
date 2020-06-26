package com.hiberus.checkout.bill.dto;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class Products {

	@NotEmpty
	@Valid
	private List<Product> products;

}