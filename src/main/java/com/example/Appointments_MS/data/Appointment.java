package com.example.Appointments_MS.data;

import jakarta.persistence.*;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    // Changed from int userId to String username
    @Column(name = "user_name") //  Match with DB column
    private String username;

    @Column(name = "vehicle_brand")
    private String vehicleBrand;

    @Column(name = "vehicle_model")
    private String vehicleModel;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "center_name")
    private String centerName;

    @Column(name = "mechanic_name")
    private String mechanicName;

    @Column(name = "appointment_time")
    private String appointmentTime;

    @Column(name = "status")
    private int status;

    public Appointment() {
    }

    public Appointment(int id, String username, String vehicleBrand, String vehicleModel, String serviceName,
                       String centerName, String mechanicName, String appointmentTime, int status) {
        this.id = id;
        this.username = username;
        this.vehicleBrand = vehicleBrand;
        this.vehicleModel = vehicleModel;
        this.serviceName = serviceName;
        this.centerName = centerName;
        this.mechanicName = mechanicName;
        this.appointmentTime = appointmentTime;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getCenterName() {
        return centerName;
    }

    public String getMechanicName() {
        return mechanicName;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public void setMechanicName(String mechanicName) {
        this.mechanicName = mechanicName;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
