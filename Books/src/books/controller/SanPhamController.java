/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books.controller;

import books.model.SanPham;
import books.service.SanPhamService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamController {
    private SanPhamService service;

    public SanPhamController() {
        service = new SanPhamService();
    }

    public List<SanPham> getAllSanPham() {
        return service.getAllSanPham();
    }
//    public void addSanPham(SanPham tacGia) {
//        // Thực hiện logic để thêm tác giả vào cơ sở dữ liệu
//        // Ví dụ: Gọi phương thức trong service để thêm tác giả
//        service.addSanPham(tacGia);
//    }
//    public void deleteSanPham(int maSanPham){
//        service.deleteSanPham(maSanPham);
//    }
}
