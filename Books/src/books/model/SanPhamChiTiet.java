package books.model;

/**
 *
 * @author Admin
 */
public class SanPhamChiTiet {

    private String MaSPCT;
    private String MaTacGia;
    private String MaSP;
    private String MaTheLoai;
    private String ten;
    private float gia;
    private String ngonNgu;
    private int soTrang;
    private String nhaXuatBan;
    private int namXuatBan;
    private int lanTaiBan;

    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(String MaSPCT, String MaTacGia, String MaSP, String MaTheLoai, String ten, float gia, String ngonNgu, int soTrang, String nhaXuatBan, int namXuatBan, int lanTaiBan) {
        this.MaSPCT = MaSPCT;
        this.MaTacGia = MaTacGia;
        this.MaSP = MaSP;
        this.MaTheLoai = MaTheLoai;
        this.ten = ten;
        this.gia = gia;
        this.ngonNgu = ngonNgu;
        this.soTrang = soTrang;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
        this.lanTaiBan = lanTaiBan;
    }

    public String getMaSPCT() {
        return MaSPCT;
    }

    public void setMaSPCT(String MaSPCT) {
        this.MaSPCT = MaSPCT;
    }

    public String getMaTacGia() {
        return MaTacGia;
    }

    public void setMaTacGia(String MaTacGia) {
        this.MaTacGia = MaTacGia;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(String MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
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
    
    
}
