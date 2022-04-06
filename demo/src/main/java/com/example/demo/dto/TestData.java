package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestData {
	private String name;
	private String address;
	private String hpno;
	private String email;
	
}
