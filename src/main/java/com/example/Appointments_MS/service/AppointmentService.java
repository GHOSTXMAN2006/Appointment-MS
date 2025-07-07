package com.example.Appointments_MS.service;

import com.example.Appointments_MS.data.Appointment;
import com.example.Appointments_MS.data.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repo;

    // 📥 Book a new appointment
    public Appointment bookAppointment(Appointment a) {
        return repo.save(a);
    }

    // 🔁 Update/reschedule appointment
    public Appointment updateAppointment(int id, Appointment a) {
        Optional<Appointment> existing = repo.findById(id);
        if (existing.isPresent()) {
            a.setId(id); // Ensure the ID remains same
            return repo.save(a);
        }
        return null;
    }

    // ❌ Cancel appointment
    public void cancelAppointment(int id) {
        repo.deleteById(id);
    }

    // 📖 Get appointments by username (String)
    public List<Appointment> getAppointmentsByUser(String username) {
        return repo.findByUsername(username);
    }

    // 🛠️ Admin updates only the status
    public Appointment updateStatus(int id, int status) {
        Optional<Appointment> existing = repo.findById(id);
        if (existing.isPresent()) {
            Appointment a = existing.get();
            a.setStatus(status); // ✅ Update only the status
            return repo.save(a);
        }
        return null;
    }

    public List<Appointment> getAllAppointments() {
        return repo.findAll();  // assuming you have JPA repository
    }


}
