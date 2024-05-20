package org.o7planning.thymeleaf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class HangHoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maHang;
    private String tenHang;

    @ManyToOne
    private ChatLieu maChatLieu;

    private Integer soLuong;
    private Double donGiaNhap;
    private Double donGiaBan;
    private String anh;
    private String ghiChu;

    // Getters and Setters
    public Integer getMaHang() {
        return maHang;
    }

    public void setMaHang(Integer maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public ChatLieu getMaChatLieu() {
        return maChatLieu;
    }

    public void setMaChatLieu(ChatLieu maChatLieu) {
        this.maChatLieu = maChatLieu;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Double getDonGiaNhap() {
        return donGiaNhap;
    }

    public void setDonGiaNhap(Double donGiaNhap) {
        this.donGiaNhap = donGiaNhap;
    }

    public Double getDonGiaBan() {
        return donGiaBan;
    }

    public void setDonGiaBan(Double donGiaBan) {
        this.donGiaBan = donGiaBan;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
