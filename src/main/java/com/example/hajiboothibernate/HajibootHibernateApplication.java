package com.example.hajiboothibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HajibootHibernateApplication {

	@Autowired
	private PlanDao planDao;

	@GetMapping("/getPlanList")
	public List<Plan> getPlanList() {
		return planDao.getPlanList();
	}

	@GetMapping("/getPlan")
	public Plan getPlan() {
		return planDao.getPlan();
	}

	public static void main(String[] args) {
		SpringApplication.run(HajibootHibernateApplication.class, args);
	}

}
