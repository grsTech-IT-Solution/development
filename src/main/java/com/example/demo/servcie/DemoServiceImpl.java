package com.example.demo.servcie;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Siddhu";
	}

	@Override
	public String getAdd() {
		// TODO Auto-generated method stub
		return "Singapore";
	}

}
