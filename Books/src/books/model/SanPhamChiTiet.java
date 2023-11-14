package books.model;

import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class SanPhamChiTiet {

    private int maSPCT;
    private TacGia tacGia;
    private SanPham sanPham;
    private TheLoai theLoai;
    private String ten;
    private BigDecimal gia;
    private String ngonNgu;
    private int soTrang;
    private String nhaXuatBan;
    private int namXuatBan;
    private int lanTaiBan;

    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(int maSPCT, TacGia tacGia, SanPham sanPham, TheLoai theLoai, String ten, BigDecimal gia, String ngonNgu, int soTrang, String nhaXuatBan, int namXuatBan, int lanTaiBan) {
        this.maSPCT = maSPCT;
        this.tacGia = tacGia;
        this.sanPham = sanPham;
        this.theLoai = theLoai;
        this.ten = ten;
        this.gia = gia;
        this.ngonNgu = ngonNgu;
        this.soTrang = soTrang;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
        this.lanTaiBan = lanTaiBan;
    }

    public int getMaSPCT() {
        return maSPCT;
    }

    public void setMaSPCT(int maSPCT) {
        this.maSPCT = maSPCT;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public TheLoai getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(TheLoai theLoai) {
        this.theLoai = theLoai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public BigDecimal getGia() {
        return gia;
    }

    public void setGia(BigDecimal gia) {
        this.gia = gia;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getLanTaiBan() {
        return lanTaiBan;
    }

    public void setLanTaiBan(int lanTaiBan) {
        this.lanTaiBan = lanTaiBan;
    }

    public void setTacGia(String tenTacGia) {
        if (this.tacGia == null) {
            this.tacGia = new TacGia();
        }
        this.tacGia.setTenTacGia(tenTacGia);
    }

    public void setTheLoai(String tenTheLoai) {
        if (this.theLoai == null) {
            this.theLoai = new TheLoai();
        }
        this.theLoai.setTenTheLoai(tenTheLoai);
    }

}
