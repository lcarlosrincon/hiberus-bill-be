package com.hiberus.checkout.bill.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductsResponse {

	private Products order;
	private Double total;

}
