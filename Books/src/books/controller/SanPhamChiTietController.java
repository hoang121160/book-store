/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books.controller;

import books.service.SanPhamChiTietService;
import books.model.SanPhamChiTiet;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamChiTietController {
     private SanPhamChiTietService sanPhamChiTietService;

    public SanPhamChiTietController() {
        sanPhamChiTietService = new SanPhamChiTietService();
    }

    public List<SanPhamChiTiet> getAllSanPhamChiTiet() {
        return sanPhamChiTietService.getAllSanPhamChiTiet();
    }
    public List<SanPhamChiTiet> getSanPhamChiTietByMaSP(int maSP) {
        return sanPhamChiTietService.getSanPhamChiTietByMaSP(maSP);
    }

    public void addSanPhamChiTiet(SanPhamChiTiet sanPhamChiTiet) {
        sanPhamChiTietService.addSanPhamChiTiet(sanPhamChiTiet);
    }

    public void deleteSanPhamChiTiet(int maSPCT) {
        sanPhamChiTietService.deleteSanPhamChiTiet(maSPCT);
    }

    public void updateSanPhamChiTiet(SanPhamChiTiet sanPhamChiTiet) {
        sanPhamChiTietService.updateSanPhamChiTiet(sanPhamChiTiet);
    }
}
