
package books.controller;

import books.model.TacGia;
import books.service.TacGiaService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TacGiaController {
     private TacGiaService service;

    public TacGiaController() {
        service = new TacGiaService();
    }

    public List<TacGia> getAllTacGia() {
        return service.getAllTacGia();
    }
    public void addTacGia(TacGia tacGia) {
        // Thực hiện logic để thêm tác giả vào cơ sở dữ liệu
        // Ví dụ: Gọi phương thức trong service để thêm tác giả
        service.addTacGia(tacGia);
    }
    public void deleteTacGia(int maTacGia){
        service.deleteTacGia(maTacGia);
    }
}
