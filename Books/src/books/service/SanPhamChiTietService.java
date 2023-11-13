/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books.service;

import books.connect.DBcontext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import books.model.SanPhamChiTiet;
/**
 *
 * @author Admin
 */
public class SanPhamChiTietService {

    //    đẩy dữ liệu lên view sản phẩm
    public ArrayList<SanPhamChiTiet> getall() {
        try {
            List<SanPhamChiTiet> list = new ArrayList<>();
            Connection conn = DBcontext.getConnection();
            String sql = "select maSPCT,MaTacGia, MaSP, MaTheLoai, ten, gia, ngonNgu, soTrang, nhaXuatBan, namXuatBan, lanTaiBan from SanPhamChiTiet";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new SanPhamChiTiet(
                        rs.getString("maSPCT"),
                        rs.getString("MaTacGia"),
                        rs.getString("MaSP"),
                        rs.getString("MaTheLoai"),
                        rs.getString("ten"),
                        rs.getFloat("gia"),
                        rs.getString("ngonNgu"),
                        rs.getInt("soTrang"),
                        rs.getString("nhaXuatBan"),
                        rs.getInt("namXuatBan"),
                        rs.getInt("lanTaiBan")));
            }
            return (ArrayList<SanPhamChiTiet>) list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
