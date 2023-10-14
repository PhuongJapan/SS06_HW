package SS6_HW;

public class QuadraticEquation {
    /*Bước 1: Tạo lớp QuadraticEquation , khai báo các thuộc tính (properties),
    định nghĩa các phương thức khởi tạo (contructors).

    Bước 2: Định nghĩa phương thức gettter cho a, b và c.

    Bước 3: Định nghĩa phương thức getDiscriminant() trả về delta theo công thức delta = b2 - 4ac.

    Bước 4: Viết chương trình thực thi như sau:

    Nhập vào 3 giá trị cho a, b, c và hiển thị kết quả dựa trên việc tính delta.
    Nếu delta >= 0, hiển thị 2 nghiệm. Nếu delta bằng 0, hiển thị một nghiệm (do 2 nghiệm bằng nhau). Còn lại hiển thị chuỗi “The equation has no roots”
    */
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){

    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        double delta =((this.b*this.b)-(4*this.a*this.c));
        return delta;
    }
    public double getRoot1(){
        return ((-b+Math.sqrt(getDiscriminant()))/2*this.a);
    }
    public double getRoot2(){
        return ((-b-Math.sqrt(getDiscriminant()))/2*this.a);
    }

}
