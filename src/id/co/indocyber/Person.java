/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.indocyber;

/**
 *
 * @author user
 */
public class Person implements Comparable<Person>{
    private String idNama;
    private String nama;
    private String gender;
    private Boolean status;
    private String umur;
    private String alamat;
    private double salary;

    public Person(String idNama, String nama, String gender, Boolean status, String umur, String alamat, double salary) {
        this.idNama = idNama;
        this.nama = nama;
        this.gender = gender;
        this.status = status;
        this.umur = umur;
        this.alamat = alamat;
        this.salary = salary;
    }

    

//    public Person(String idNama, String nama, String gender, Boolean status, String tanggalLahir, int umur, double salary) {
//        this.idNama = idNama;
//        this.nama = nama;
//        this.gender = gender;
//        this.status = status;
//        this.tanggalLahir = tanggalLahir;
//        this.umur = umur;
//        this.salary = salary;
//    }

    

    public Person() {
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return the umur
     */
    public String getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(String umur) {
        this.umur = umur;
    }

    /**
     * @return the idNama
     */
    public String getIdNama() {
        return idNama;
    }

    /**
     * @param idNama the idNama to set
     */
    public void setIdNama(String idNama) {
        this.idNama = idNama;
    }

    /**
     * @return the tanggalLahir
     */
    

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public int compareTo(Person t) {
       return nama.compareTo(t.nama);
    }

}