package com.study.mike.dubbo.consumer;

import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.study.mike.dubbo.DemoService;

@RestController
public class AnnotationDemoAction {

	@Reference
	private DemoService demoService;

	public String doSayHello(String name) {
		return demoService.sayHello(name);
	}
}
