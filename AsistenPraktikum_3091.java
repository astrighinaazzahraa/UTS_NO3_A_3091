/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainn;

/**
 *
 * @author User
 */
public class AsistenPraktikum_3091 {
    String mkAsisten;
int jmlPertemuan;
    String nim;
    String nama;
    String jurusan;
    int ipk;
public double totalPendapatan(){
return(jmlPertemuan * 50000);
}
public void tampilDataAsistenPraktikum() {

System.out.println(" Mata Kuliah : " + mkAsisten);
System.out.println(" Jumlah Pertemuan : " + jmlPertemuan);
System.out.println(" Total Pendapatan : " + totalPendapatan());
}
}

