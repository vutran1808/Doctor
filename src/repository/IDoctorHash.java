/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.Doctor;

/**
 *
 * @author ASUS
 */
public interface IDoctorHash {
    void addDoctor(Map<String, Doctor> doctorList);
    void updateDoctor(Map<String, Doctor> doctorList);
    void deleteDoctor(Map<String, Doctor> doctorList);
    void searchDoctor(Map<String, Doctor> doctorList);
}
