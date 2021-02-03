package com.upgrad.hireWheels;


import org.modelmapper.ModelMapper;
import org.springframework.context.ApplicationContext;
import com.upgrad.hireWheels.Entities.vehicle;
import com.upgrad.hireWheels.dao.*;
import com.upgrad.hireWheels.services.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.management.relation.Role;
import java.util.List;

@SpringBootApplication
public class HireWheelsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HireWheelsApplication.class, args);

		bookingDAO book = context.getBean(bookingDAO.class);
		cityDAO c = context.getBean(cityDAO.class);
		fuelDAO fuel = context.getBean(fuelDAO.class);
		locationDAO loc = context.getBean(locationDAO.class);
		roleDAO r = context.getBean(roleDAO.class);
		UserDAO user = context.getBean(UserDAO.class);
		vehicleDAO v = context.getBean(vehicleDAO.class);
		vehicle_subcatDAO movieDao = context.getBean(vehicle_subcatDAO.class);



		vehicle vehicle1= new vehicle();
		vehicle1.set_vehicle_id(1);
		vehicle1.set_vehicle_model("Sedan");
		vehicle1.set_vehicle_number(12345);
		vehicle1.setVehicleSubcategoryID(11);
		vehicle1.set_color("Yellow");
		vehicle1.set_location_id(6);
		vehicle1.set_feul_type_id(1);
		vehicle1.set_available_status(1);
		vehicle1.set_vehicle_image_url("https://localhost");



		vehicle vehicle2= new vehicle();
		vehicle2.set_vehicle_id(5);
		vehicle2.set_vehicle_model("Batmobile");
		vehicle2.set_vehicle_number(12345);
		vehicle2.setVehicleSubcategoryID(11);
		vehicle2.set_color("green");
		vehicle2.set_location_id(6);
		vehicle2.set_feul_type_id(1);
		vehicle2.set_available_status(1);
		vehicle2.set_vehicle_image_url("https://localhost/8080");

		v.saveAll(List.of(vehicle1,vehicle2));

		System.out.println(v.findAll());





		
/*
		Users user1 = new Users();
		user1.Set_UserId(1);
		user1.Set_User_first_name("Akshay");
		user1.set_User_last_name("Deosthale");
		user1.setpassword("root");
		user1.set_User_email("akshay.deosthale6@gmail.com");
		user1.set_User_mobile_number("9096180257");
		user1.set_User_role_id(1);

		Users user2 = new Users();
		user2.Set_UserId(2);
		user2.Set_User_first_name("Atharva");
		user2.set_User_last_name("Deosthale");
		user2.setpassword("root");
		user2.set_User_email("atharva.deosthale6@gmail.com");
		user2.set_User_mobile_number("111111111");
		user2.set_User_role_id(2);

		Users user3 = new Users();
		user3.Set_UserId(3);
		user3.Set_User_first_name("Nitin");
		user3.set_User_last_name("Deosthale");
		user3.setpassword("root");
		user3.set_User_email("nitin.deosthale6@gmail.com");
		user3.set_User_mobile_number("2222222222");
		user3.set_User_role_id(2);

		Users user4 = new Users();
		user4.Set_UserId(4);
		user4.Set_User_first_name("Varsha");
		user4.set_User_last_name("Deosthale");
		user4.setpassword("root");
		user4.set_User_email("varsha.deosthale6@gmail.com");
		user4.set_User_mobile_number("3333333333");
		user4.set_User_role_id(2);


		user.saveAll(List.of(user1 , user2 ,user3, user4));




		role role1 = new role();
		role1.set_role_id(1);
		role1.set_role_name("ADMIN");

		role role2 = new role();
		role2.set_role_id(2);
		role2.set_role_name("USER");

		r.saveAll(List.of(role1,role2));

 */


	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
