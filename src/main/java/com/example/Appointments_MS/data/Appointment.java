package com.example.Appointments_MS.data;

import jakarta.persistence.*;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "vehicle_id")
    private int vehicleId;

    @Column(name = "service_id")
    private int serviceId;

    @Column(name = "center_id")
    private int centerId;

    @Column(name = "mechanic_id")
    private int mechanicId;

    @Column(name = "appointment_time")
    private String appointmentTime;

    @Column(name = "status")
    private int status;

    public Appointment() {
    }

    public Appointment(int id, int userId, int vehicleId, int serviceId, int centerId, int mechanicId, String appointmentTime, int status) {
        this.id = id;
        this.userId = userId;
        this.vehicleId = vehicleId;
        this.serviceId = serviceId;
        this.centerId = centerId;
        this.mechanicId = mechanicId;
        this.appointmentTime = appointmentTime;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public int getCenterId() {
        return centerId;
    }

    public int getMechanicId() {
        return mechanicId;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public int getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public void setCenterId(int centerId) {
        this.centerId = centerId;
    }

    public void setMechanicId(int mechanicId) {
        this.mechanicId = mechanicId;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
