package ThucHanh3;

import java.util.ArrayList;
import java.util.List;

public class ProductApp {
    public static void main(String[] args) {
        // Tạo đối tượng objProduct1 với phương thức khởi tạo không tham số
        Product objProduct1 = new Product("P001", "Laptop", 1500.00, "Dell");
        objProduct1.setProID("001");
        objProduct1.setProName("Product 1");
        objProduct1.setProPrice(100.0);

        // Tạo đối tượng objProduct2 với phương thức khởi tạo 3 tham số
        Product objProduct2 = new Product("002", "Product 2", 200.0);

        // Tạo danh sách sản phẩm
        List<Product> productList = new ArrayList<>();
        productList.add(objProduct1);
        productList.add(objProduct2);

        // Tạo đối tượng objProductProcess
        ProductProcess objProductProcess = new ProductProcess();

        // Ghi danh sách đối tượng vào file object.dat
        objProductProcess.writeObjectData(productList, "object.dat");

        // Đọc dữ liệu từ file object.dat
        List<Product> listProduct = objProductProcess.readObjectData("object.dat");

        // Hiển thị danh sách đối tượng listProduct
        if (listProduct != null) {
            for (Product product : listProduct) {
                System.out.println(product);
            }
        } else {
            System.out.println("Không có dữ liệu hoặc lỗi khi đọc file.");
        }
    }
}