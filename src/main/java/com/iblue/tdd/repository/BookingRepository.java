package com.iblue.tdd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iblue.tdd.model.BookingModel;

public interface BookingRepository extends JpaRepository<BookingModel, Long> {

	Optional<BookingModel> findByReserveName(String name);

}
