package me.dio.web.parking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.web.parking.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}