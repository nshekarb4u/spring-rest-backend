package com.shekar.rest.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.hateoas.Identifiable;

import lombok.Data;

@Data
public class Order implements Identifiable<Long> {

	private Long id;
	private String description;
	private List<LineItem> lineItems = new ArrayList<>();
	
	@Override
	public Long getId() {
		return id;
	}
	
	public void addLineItem(LineItem lineItem) {
		lineItems.add(lineItem);
	}
	
	public void removeLineItem(LineItem lineItem) {
		lineItems.remove(lineItem);
	}
	
	public Long getTotalCostInCents() {
		return lineItems.stream().collect(Collectors.summingLong(item -> item.getCostInCents()));
	}

}
