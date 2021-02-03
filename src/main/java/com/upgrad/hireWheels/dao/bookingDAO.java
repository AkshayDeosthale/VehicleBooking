package com.upgrad.hireWheels.dao;
import com.upgrad.hireWheels.Entities.booking;
import org.springframework.data.jpa.repository.JpaRepository;


public interface bookingDAO extends JpaRepository<booking,Integer> {
}
