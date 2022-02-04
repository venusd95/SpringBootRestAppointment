package com.tejoma.app.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tejoma.app.model.Appointment;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	List<Appointment> findAllByAppointmentDateBetweenOrderByPriceAsc(LocalDate startDate, LocalDate endDate);

}
