package ThucHanh1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi ban muon ghi vao file: ");
        String inputString = scanner.nextLine();

        //  Tạo đối tượng FileOutputStream
        try (FileOutputStream fos = new FileOutputStream("person.dat")) {
            //  Ghi chuỗi nhập trên vào file
            fos.write(inputString.getBytes());
            System.out.println("Du lieu duoc ghi vao file ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // đọc dữ liệu từ file
        try (FileInputStream fis = new FileInputStream("person.dat")) {
            int data;
            System.out.printf("Noi dung cua file person.dat: \n");
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        }catch (IOException e) {
            e.printStackTrace();

        }

//        scanner.close();


    }


}

