package com.example.Appointments_MS.controller;

import com.example.Appointments_MS.data.Appointment;
import com.example.Appointments_MS.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    // 🎯 Book a new appointment
    @PostMapping("/appointments")
    public Appointment bookAppointment(@RequestBody Appointment a) {
        return service.bookAppointment(a);
    }

    // 🔁 Update/reschedule an appointment
    @PutMapping("/appointments/{id}")
    public Appointment updateAppointment(@PathVariable int id, @RequestBody Appointment a) {
        return service.updateAppointment(id, a);
    }

    // ❌ Cancel an appointment
    @DeleteMapping("/appointments/{id}")
    public void cancelAppointment(@PathVariable int id) {
        service.cancelAppointment(id);
    }

    // 📖 Get appointment history for a user
    @GetMapping("/appointments/{userId}")
    public List<Appointment> getUserAppointments(@PathVariable int userId) {
        return service.getAppointmentsByUser(userId);
    }
}
