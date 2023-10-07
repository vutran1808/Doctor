/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.ScannerFactory;
import java.util.HashMap;
import java.util.Map;
import model.Doctor;

/**
 *
 * @author ASUS
 */
public class DoctorDao {

    private static DoctorDao instance = null;
    ScannerFactory sc;

    public DoctorDao() {
        sc = new ScannerFactory();
    }

    public static DoctorDao Instance() {
        if (instance == null) {
            synchronized (DoctorDao.class) {
                if (instance == null) {
                    instance = new DoctorDao();
                }
            }
        }
        return instance;
    }

    public void addDoctor(Map<String, Doctor> doctorList) {
        System.out.println("Enter code: ");
        String code = sc.getString();
        System.out.println("Enter Name: ");
        String name = sc.getString();
        System.out.println("Enter Specialization: ");
        String specialization = sc.getString();
        System.out.println("Enter Availability: ");
        int avalability = sc.getInt();
        if (doctorList.isEmpty()) {
            doctorList.put(code, new Doctor(code, name, specialization, avalability));
            System.out.println("Added");
        } else {
            for (String key : doctorList.keySet()) {
                if (key.equals(code)) {
                    System.out.println("Code Existed");
                    return;
                } else {
                    doctorList.put(code, new Doctor(code, name, specialization, avalability));
                    System.out.println("Added");
                }
            }
        }

    }

    public void searchDoctor(Map<String, Doctor> doctorList) {
        System.out.println("Enter code: ");
        String code = sc.getString();
        if (doctorList.isEmpty()) {
            System.out.println("1");
        }
        for (String key : doctorList.keySet()) {
            if (code.equals(key)) {
                System.out.println("Doctor found: ");
                System.out.println(doctorList.get(key).toString());
            } else {
                System.out.println("Code not existed");
            }
        }
    }

    public void updateDoctor(Map<String, Doctor> doctorList) {
        System.out.println("Enter code: ");
        String code = sc.getString();
        for (String key : doctorList.keySet()) {
            if (key.equals(code)) {
                System.out.println("Doctor found: ");
                System.out.println(doctorList.get(key).toString());
                System.out.println("Enter name: ");
                String name = sc.getString();
                System.out.println("Enter Specialization: ");
                String specialization = sc.getString();
                System.out.println("Enter availability");
                int availability = sc.getInt();
                doctorList.get(key).setName(name);
                doctorList.get(key).setSpecialization(specialization);
                doctorList.get(key).setAvailability(availability);
                System.out.println("Updated");
            } else {
                System.out.println("Code not existed");
            }
        }
    }

    public void deleteDoctor(Map<String, Doctor> doctorList) {
        displayAll(doctorList);
        System.out.println("Enter code: ");
        String code = sc.getString();
        for (String key : doctorList.keySet()) {
            if (key.equals(code)) {
                System.out.println("Doctor found: ");
                System.out.println(doctorList.get(key).toString());
                System.out.println("Do u want to delete this Doctor ? (Y/n)");
                String input = sc.getYN();
                if (input.equalsIgnoreCase( "Y")) {
                    doctorList.remove(key, doctorList.get(key));
                } else {
                    return;
                }
            } else {
                System.out.println("Code not existed");
            }
        }
    }

    public void displayAll(Map<String, Doctor> doctorList) {
        for (String key : doctorList.keySet()) {
            System.out.println(doctorList.get(key).toString());
        }
    }

}
