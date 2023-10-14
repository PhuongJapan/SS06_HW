package SS6_HW2;

public class Circle {
    /*Bước 1: Tạo lớp Circle, khai báo các thuộc tính (properties),
    định nghĩa các phương thức khởi tạo (constructors).

    Bước 2: Tạo lớp Main chưa phương thức main() để chạy chương trình.

    Bước 3: Trong lớp Main , khởi tạo các đối tượng hình tròn với bán kính khác nhau, tính chu vi và diện tích của các hình đó.

    Bước 4: Chạy chương trình và quan sát kết quả.*/
    private double banKinh;
    private String color;
    public Circle(){

    };
    public Circle(double banKinh, String color) {
        this.banKinh = banKinh;
        this.color = color;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double chuVi(){
        return (Math.PI*2*banKinh);
    }
    public double dienTich(){
        return (Math.PI*banKinh*banKinh);
    }

    public void displayData() {
        System.out.println("Bán kính"+banKinh);
        System.out.println("Màu sắc"+color);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "banKinh=" + banKinh +
                ", color='" + color + '\'' +
                '}';
    }
}
