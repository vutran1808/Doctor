/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.DoctorDao;
import java.util.HashMap;
import java.util.Map;
import model.Doctor;

/**
 *
 * @author ASUS
 */
public class DoctorHash implements IDoctorHash {

    @Override
    public void addDoctor(Map<String, Doctor> doctorList) {
        DoctorDao.Instance().addDoctor(doctorList);
    }

    @Override
    public void updateDoctor(Map<String, Doctor> doctorList) {
        DoctorDao.Instance().updateDoctor(doctorList);
    }

    @Override
    public void deleteDoctor(Map<String, Doctor> doctorList) {
        DoctorDao.Instance().deleteDoctor(doctorList);
    }

    @Override
    public void searchDoctor(Map<String, Doctor> doctorList) {
        DoctorDao.Instance().searchDoctor(doctorList);
    }

}
