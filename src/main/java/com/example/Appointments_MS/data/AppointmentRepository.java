package com.example.Appointments_MS.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

    // Get all appointments for a username (string)
    List<Appointment> findByUsername(String username);
}
