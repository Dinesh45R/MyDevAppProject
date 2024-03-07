package com.onesoft.MyDevAppsProject;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class MyDevAppProjectController {
	@GetMapping("dinesh")
	public String getMethodName() {
		return "password kuda nabagam vachika mudiyatha unala...............";
	}
	

}
