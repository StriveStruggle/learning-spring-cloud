package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.inter.ComputeClient;

@RestController
public class ConsumerController {
	@Autowired
	ComputeClient client;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public Integer add() {
		return client.add(10, 20);
	}

}