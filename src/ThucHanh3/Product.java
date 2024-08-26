package ThucHanh3;

import java.io.Serializable;

public class Product implements Serializable {
    private String proID;
    private String proName;
    private double proPrice;

    // Phương thức khởi tạo không tham số
    public Product(String p001, String laptop, double v, String dell) {
    }

    // Phương thức khởi tạo có 3 tham số
    public Product(String proID, String proName, double price) {
        this.proID = proID;
        this.proName = proName;
        this.proPrice = price;
    }

    // Các phương thức getter và setter
    public String getProID() {
        return proID;
    }

    public void setProID(String proID) {
        this.proID = proID;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getPrice() {
        return proPrice;
    }

    public void setProPrice(double price) {
        this.proPrice = price;
    }

    // Phương thức toString()
    @Override
    public String toString() {
        return "Product{" +
                "proID='" + proID + '\'' +
                ", proName='" + proName + '\'' +
                ", price=" + proPrice +
                '}';
    }
}

