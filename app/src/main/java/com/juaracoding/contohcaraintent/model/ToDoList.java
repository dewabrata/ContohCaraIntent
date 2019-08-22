package com.juaracoding.contohcaraintent.model;

public class ToDoList {

    private String nama;
    private String deskripsi;
    private String tanggal;
    private String notes;
    private int importance;

    public ToDoList(){

    }

    public ToDoList(String nama, String deskripsi, String tanggal, String notes, int importance) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.tanggal = tanggal;
        this.notes = notes;
        this.importance = importance;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }


}
