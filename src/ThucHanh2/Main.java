package ThucHanh2;

import ThucHanh2.FileHandler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap du lieu ghi vao: ");
        String data = scanner.nextLine();
        String fileName = "data.dat";
        try {
            boolean result = fileHandler.writeData(data, fileName);
            if (result) {
                System.out.println("Ghi du lieu thanh cong");
            } else {
                System.out.println("Ghi du lieu that bai");
            }
        } catch (Exception e) {
            System.out.printf("Lỗi khi ghi dữ liệu" +e.getMessage());
        }
    }
}
