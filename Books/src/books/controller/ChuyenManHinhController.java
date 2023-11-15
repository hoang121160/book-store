/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books.controller;

import books.bean.DanhMucBean;
import books.view.BanHangJPanel;
import books.view.DangXuatJPanel;
import books.view.HoaDonNew;
import books.view.KhachHangJPanel;
import books.view.NhanVienJPanel;
import books.view.SanPhamJPanel;
import books.view.SanPhamNew;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class ChuyenManHinhController {

    private JPanel root;
    private String kindSelected = "";
    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "QuanLySanPham";
        jpnItem.setBackground(new Color(255,204,204));
        jlbItem.setBackground(new Color(255,204,204));
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new SanPhamNew());
        root.validate();
        root.repaint();
    }

    public void setEvent(List<DanhMucBean> listItem) {
        this.listItem = listItem;
        for (DanhMucBean item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }

    }

    class LabelEvent implements MouseListener {

        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
//                case "SanPham":
//                    node = new SanPhamJPanel();
//                    break;
                case "KhachHang":
                    node = new KhachHangJPanel();
                    break;
                case "NhanVien":
                    node = new NhanVienJPanel();
                    break;
                case "BanHang":
                    node = new BanHangJPanel();
                    break;
                case "HoaDon":
                    node = new HoaDonNew();
                    break;
                case "DangXuat":
                    node = new SanPhamJPanel();
                    break;
                case "SanPhamNew":
                    node = new SanPhamNew();
                    break;
                default:
                    node = new BanHangJPanel();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setchangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(153,153,153));
            jlbItem.setBackground(new Color(153,153,153));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(153,153,153));
            jlbItem.setBackground(new Color(153,153,153));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(255,204,204));
                jlbItem.setBackground(new Color(255,204,204));
            }
        }

    }

    private void setchangeBackground(String kind) {
        for (DanhMucBean item : listItem) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color(153,153,153));
                item.getJlb().setBackground(new Color(153,153,153));
            } else {
                item.getJpn().setBackground(new Color(255,204,204));
                item.getJlb().setBackground(new Color(255,204,204));
            }
        }
    }
}
