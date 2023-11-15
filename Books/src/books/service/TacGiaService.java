/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books.service;

import books.connect.DBcontext;
import books.model.TacGia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class TacGiaService {

    private List<TacGia> tacGia;

    public TacGiaService() {
        tacGia = new ArrayList<>();
    }

    public List<TacGia> getAllTacGia() {
        try {
            List<TacGia> list = new ArrayList<>();
            Connection conn = DBcontext.getConnection();
            String sql = "SELECT maTacGia, ten, tieuSu FROM TacGia";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TacGia tg = new TacGia();
                tg.setMaTacGia(rs.getInt("maTacGia"));
                tg.setTen(rs.getString("ten"));
                tg.setTieuSu(rs.getString("tieuSu"));
                list.add(tg);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addTacGia(TacGia tacGia) {
        Connection conn = DBcontext.getConnection();
        String sql = "INSERT INTO TacGia (ten, tieuSu) VALUES (?, ?)";
        try {
            // Tạo PreparedStatement
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tacGia.getTen());
            ps.setString(2, tacGia.getTieuSu());
            // Thực thi câu lệnh SQL để thêm tác giả vào cơ sở dữ liệu
            ps.executeUpdate();
            // Đóng kết nối và các đối tượng liên quan
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteTacGia(int maTacGia) {
        String sql = "DELETE FROM tacGia WHERE maTacGia = ?";

        try (Connection conn = DBcontext.getConnection(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, maTacGia);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Xóa tác giả thành công");
            } else {
                System.out.println("Không tìm thấy tác giả có mã: " + maTacGia);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
