/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DeThi.De03;

/**
 *
 * @author Finn
 */
public class SinhVienMatMa extends SinhVien{
    private String donVi;
    private double luong;

    public SinhVienMatMa() {
    }

    public SinhVienMatMa(String donVi, double luong) {
        this.donVi = donVi;
        this.luong = luong;
    }

    public SinhVienMatMa(String donVi, double luong, String maSV, String ten, String ngaySinh, String gioiTinh, double diemTB) {
        super(maSV, ten, ngaySinh, gioiTinh, diemTB);
        this.donVi = donVi;
        this.luong = luong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString() + donVi + "$" + luong ;
    }
    
    
}
