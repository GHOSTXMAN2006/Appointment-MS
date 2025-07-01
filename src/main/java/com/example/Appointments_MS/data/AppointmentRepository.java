package com.example.Appointments_MS.data;

import com.example.Appointments_MS.data.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

    // 📖 Get all appointments for a user
    List<Appointment> findByUserId(int userId);
}
