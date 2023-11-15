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
import books.model.TacGia;
import books.model.TheLoai;

/**
 *
 * @author Admin
 */
public class SanPhamChiTietService {

//    //    đẩy dữ liệu lên view sản phẩm
//    public ArrayList<SanPhamChiTiet> getAll() {
//    try {
//        List<SanPhamChiTiet> list = new ArrayList<>();
//        Connection conn = DBcontext.getConnection();
//        String sql = "SELECT\n" +
//                "    spct.maSPCT,\n" +
//                "    tg.ten AS tenTacGia,\n" +
//                "    tl.ten AS tenTheLoai,\n" +
//                "    spct.ten,\n" +
//                "    spct.gia,\n" +
//                "    spct.ngonNgu,\n" +
//                "    spct.soTrang,\n" +
//                "    spct.nhaXuatBan,\n" +
//                "    spct.namXuatBan,\n" +
//                "    spct.lanTaiBan\n" +
//                "FROM\n" +
//                "    SanPhamChiTiet spct\n" +
//                "    INNER JOIN TacGia tg ON spct.MaTacGia = tg.maTacGia\n" +
//                "    INNER JOIN TheLoai tl ON spct.MaTheLoai = tl.MaTheLoai";
//        PreparedStatement ps = conn.prepareStatement(sql);
//        ResultSet rs = ps.executeQuery();
//        while (rs.next()) {
//            SanPhamChiTiet spct = new SanPhamChiTiet();
//            spct.setMaSPCT(rs.getInt("maSPCT"));
//            spct.setTenTacGia(rs.getString("tenTacGia"));
//            spct.setTenTheLoai(rs.getString("tenTheLoai"));
//            spct.setTen(rs.getString("ten"));
//            spct.setGia(rs.getFloat("gia"));
//            spct.setNgonNgu(rs.getString("ngonNgu"));
//            spct.setSoTrang(rs.getInt("soTrang"));
//            spct.setNhaXuatBan(rs.getString("nhaXuatBan"));
//            spct.setNamXuatBan(rs.getInt("namXuatBan"));
//            spct.setLanTaiBan(rs.getInt("lanTaiBan"));
//            list.add(spct);
//        }
//        return (ArrayList<SanPhamChiTiet>) list;
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//    return null;
//}
//
//    public void add(SanPhamChiTiet sp) {
//        try {
//            Connection conn = DBcontext.getConnection();
//            String sql = "insert into SanPhamChiTiet (MaTacGia,MaSanPham,MaTheLoai,ten,gia,ngonNgu,soTrang,nhaXuatBan,namXuatBan,lanTaiBan) values (?,?,?,?,?,?,?,?,?,?)";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            
//        } catch (Exception e) {
//        }
//    }
    private List<SanPhamChiTiet> sanPhamChiTietList;

    public SanPhamChiTietService() {
        sanPhamChiTietList = new ArrayList<>();
    }

    public List<SanPhamChiTiet> getAllSanPhamChiTiet() {
        try {
            List<SanPhamChiTiet> list = new ArrayList<>();
            Connection conn = DBcontext.getConnection();
            String sql = "SELECT\n"
                    + "    spct.maSPCT,\n"
                    + "    tg.ten AS tenTacGia,\n"
                    + "    tl.ten AS tenTheLoai,\n"
                    + "    spct.ten,\n"
                    + "    spct.gia,\n"
                    + "    spct.ngonNgu,\n"
                    + "    spct.soTrang,\n"
                    + "    spct.nhaXuatBan,\n"
                    + "    spct.namXuatBan,\n"
                    + "    spct.lanTaiBan\n"
                    + "FROM\n"
                    + "    SanPhamChiTiet spct\n"
                    + "    INNER JOIN TacGia tg ON spct.MaTacGia = tg.maTacGia\n"
                    + "    INNER JOIN TheLoai tl ON spct.MaTheLoai = tl.MaTheLoai";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPhamChiTiet spct = new SanPhamChiTiet();
                spct.setMaSPCT(rs.getInt("maSPCT"));
                spct.setTacGia(rs.getString("tenTacGia"));
                spct.setTheLoai(rs.getString("tenTheLoai"));
                spct.setTen(rs.getString("ten"));
                spct.setGia(rs.getBigDecimal("gia"));
                spct.setNgonNgu(rs.getString("ngonNgu"));
                spct.setSoTrang(rs.getInt("soTrang"));
                spct.setNhaXuatBan(rs.getString("nhaXuatBan"));
                spct.setNamXuatBan(rs.getInt("namXuatBan"));
                spct.setLanTaiBan(rs.getInt("lanTaiBan"));
                list.add(spct);
            }
            return (ArrayList<SanPhamChiTiet>) list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<SanPhamChiTiet> getSanPhamChiTietByMaSP(int maSP) {
    try {
        List<SanPhamChiTiet> list = new ArrayList<>();
        Connection conn = DBcontext.getConnection();
        String sql = "SELECT\n"
                + "    spct.maSPCT,\n"
                + "    tg.ten AS tenTacGia,\n"
                + "    tl.ten AS tenTheLoai,\n"
                + "    spct.ten,\n"
                + "    spct.gia,\n"
                + "    spct.ngonNgu,\n"
                + "    spct.soTrang,\n"
                + "    spct.nhaXuatBan,\n"
                + "    spct.namXuatBan,\n"
                + "    spct.lanTaiBan\n"
                + "FROM\n"
                + "    SanPhamChiTiet spct\n"
                + "    INNER JOIN TacGia tg ON spct.MaTacGia = tg.maTacGia\n"
                + "    INNER JOIN TheLoai tl ON spct.MaTheLoai = tl.MaTheLoai\n"
                + "WHERE\n"
                + "    spct.maSPCT = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, maSP);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            SanPhamChiTiet spct = new SanPhamChiTiet();
            spct.setMaSPCT(rs.getInt("maSPCT"));
            spct.setTacGia(rs.getString("tenTacGia"));
            spct.setTheLoai(rs.getString("tenTheLoai"));
            spct.setTen(rs.getString("ten"));
            spct.setGia(rs.getBigDecimal("gia"));
            spct.setNgonNgu(rs.getString("ngonNgu"));
            spct.setSoTrang(rs.getInt("soTrang"));
            spct.setNhaXuatBan(rs.getString("nhaXuatBan"));
            spct.setNamXuatBan(rs.getInt("namXuatBan"));
            spct.setLanTaiBan(rs.getInt("lanTaiBan"));
            list.add(spct);
        }
        return list;
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}

    public void addSanPhamChiTiet(SanPhamChiTiet sp) {
        try {
            Connection conn = DBcontext.getConnection();
            String query = "INSERT INTO SanPhamChiTiet (MaTacGia, MaTheLoai, ten, gia, ngonNgu, soTrang, nhaXuatBan, namXuatBan, lanTaiBan)\n"
                    + "VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            TacGia tacGia = sp.getTacGia();
            String tenTacGia = tacGia.getTen();
            ps.setString(1, tenTacGia);
            TheLoai theLoai = sp.getTheLoai();
            String tenTheLoai = theLoai.getTen();
            ps.setString(2, tenTheLoai);
            ps.setString(3, sp.getTen());
            ps.setBigDecimal(4, sp.getGia());
            ps.setString(5, sp.getNgonNgu());
            ps.setInt(6, sp.getSoTrang());
            ps.setString(7, sp.getNhaXuatBan());
            ps.setInt(8, sp.getNamXuatBan());
            ps.setInt(9, sp.getLanTaiBan());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteSanPhamChiTiet(int maSPCT) {
        SanPhamChiTiet sanPhamChiTietToDelete = null;
        for (SanPhamChiTiet sanPhamChiTiet : sanPhamChiTietList) {
            if (sanPhamChiTiet.getMaSPCT() == maSPCT) {
                sanPhamChiTietToDelete = sanPhamChiTiet;
                break;
            }
        }
        if (sanPhamChiTietToDelete != null) {
            sanPhamChiTietList.remove(sanPhamChiTietToDelete);
        }
    }

    public void updateSanPhamChiTiet(SanPhamChiTiet sanPhamChiTietToUpdate) {
        for (SanPhamChiTiet sanPhamChiTiet : sanPhamChiTietList) {
            if (sanPhamChiTiet.getMaSPCT() == sanPhamChiTietToUpdate.getMaSPCT()) {
                sanPhamChiTiet.setTacGia(sanPhamChiTietToUpdate.getTacGia());
                sanPhamChiTiet.setTheLoai(sanPhamChiTietToUpdate.getTheLoai());
                sanPhamChiTiet.setTen(sanPhamChiTietToUpdate.getTen());
                sanPhamChiTiet.setGia(sanPhamChiTietToUpdate.getGia());
                sanPhamChiTiet.setNgonNgu(sanPhamChiTietToUpdate.getNgonNgu());
                sanPhamChiTiet.setSoTrang(sanPhamChiTietToUpdate.getSoTrang());
                sanPhamChiTiet.setNhaXuatBan(sanPhamChiTietToUpdate.getNhaXuatBan());
                sanPhamChiTiet.setNamXuatBan(sanPhamChiTietToUpdate.getNamXuatBan());
                sanPhamChiTiet.setLanTaiBan(sanPhamChiTietToUpdate.getLanTaiBan());
                break;
            }
        }
    }
}
