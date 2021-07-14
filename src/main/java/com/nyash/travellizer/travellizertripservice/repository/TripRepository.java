package com.nyash.travellizer.travellizertripservice.repository;


import com.nyash.travellizer.travellizertripservice.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Integer> {
}
