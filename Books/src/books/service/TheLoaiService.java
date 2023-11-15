/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books.service;

import books.connect.DBcontext;
import books.model.TheLoai;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TheLoaiService {
    private List<TheLoai> theLoai;

    public TheLoaiService() {
        theLoai = new ArrayList<>();
    }

    public List<TheLoai> getAllTheLoai() {
        try {
            List<TheLoai> list = new ArrayList<>();
            Connection conn = DBcontext.getConnection();
            String sql = "SELECT MaTheLoai, ten FROM TheLoai";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TheLoai tl = new TheLoai();
                tl.setMaTheLoai(rs.getInt("MaTheLoai"));
                tl.setTen(rs.getString("ten"));
                list.add(tl);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
