/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books.service;

import books.connect.DBcontext;
import books.model.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamService {
      private List<SanPham> tacGia;

    public SanPhamService() {
        tacGia = new ArrayList<>();
    }

    public List<SanPham> getAllSanPham() {
        try {
            List<SanPham> list = new ArrayList<>();
            Connection conn = DBcontext.getConnection();
            String sql = "select maSP, ten from SanPham";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getInt("maSP"));
                sp.setTen(rs.getString("ten"));
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
