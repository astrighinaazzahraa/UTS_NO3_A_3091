/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainn;

/**
 *
 * @author User
 */
public class StudentStaff_3091 {
    int unitKerja, jamKerja;
    String nim;
    String nama;
    String jurusan;
    int ipk;
public double totalPendapatan(){
return (jamKerja * 30000);
}
public void tampilDataStudentStaff(){

System.out.println(" Unit Kerja : " + unitKerja);
System.out.println(" Jam Kerja : " +jamKerja);
System.out.println(" Total Pendapatan Student Staff : " +totalPendapatan());
}
}

