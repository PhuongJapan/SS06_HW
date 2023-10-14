package SS6_HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*Bước 4: Viết chương trình thực thi như sau:

    Nhập vào 3 giá trị cho a, b, c và hiển thị kết quả dựa trên việc tính delta.
    Nếu delta >= 0, hiển thị 2 nghiệm. Nếu delta bằng 0, hiển thị một nghiệm (do 2 nghiệm bằng nhau). Còn lại hiển thị chuỗi “The equation has no roots”
    */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập giá trị a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá trị b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá trị c");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        //Khởi tạo đối tượng từ lớp
        //Lấy ra phương thức từ lớp
        if(quadraticEquation.getDiscriminant()>=0){
            System.out.printf("Phương trình có 2 nghiệm %f %f\n",
                    quadraticEquation.getRoot1(),quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant()==0) {
            System.out.printf("Phương trình có 1 nghiệm kép %f",quadraticEquation.getRoot1());

        }
        else {
            System.out.println("Phương trình ko có nghiệm");
        }
    }
}