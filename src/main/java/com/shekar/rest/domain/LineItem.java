package com.shekar.rest.domain;

import org.springframework.hateoas.Identifiable;

import lombok.Data;

@Data
public class LineItem implements Identifiable<Long> {

	private Long id;
	private String name;
	private String description;
	private Long costInCents;
}
