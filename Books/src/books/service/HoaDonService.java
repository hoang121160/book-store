/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books.service;

import books.connect.DBcontext;
import books.model.HoaDonChiTiet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonService {

    private List<HoaDonChiTiet> hoaDonChiTiet;

    public HoaDonService() {
        hoaDonChiTiet = new ArrayList<>();
    }

    public List<HoaDonChiTiet> getAllHoaDonChiTiet() {
        try {
            List<HoaDonChiTiet> list = new ArrayList<>();
            Connection conn = DBcontext.getConnection();
            String sql = "SELECT H.maSPCT, S.ten as tenSp, H.soLuong, H.donGia, H.thanhTien, H.trangThai FROM HoaDonChiTiet H INNER JOIN SanPhamChiTiet S ON H.maSPCT = S.maSPCT";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonChiTiet hdct = new HoaDonChiTiet();
                hdct.setMaSPCT(rs.getInt("maSPCT"));
                hdct.setTenSp(rs.getString("tenSP"));
                hdct.setSoLuong(rs.getInt("soLuong"));
                hdct.setDonGia(rs.getBigDecimal("donGia"));
                hdct.setThanhTien(rs.getBigDecimal("thanhTien"));
                hdct.setTrangThai(rs.getString("trangThai"));
                list.add(hdct);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getTenSPByMaSPCT(int maSPCT) {
        List<HoaDonChiTiet> danhSachHoaDonChiTiet = new ArrayList<>(); // Lấy danh sách sản phẩm chi tiết từ cơ sở dữ liệu hoặc nguồn dữ liệu khác

        for (HoaDonChiTiet hoaDonChiTiet : danhSachHoaDonChiTiet) {
            if (hoaDonChiTiet.getMaSPCT() == maSPCT) {
                return hoaDonChiTiet.getTenSp();
            }
        }

        return null;
    }
}
