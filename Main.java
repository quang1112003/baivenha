package Fraction;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Fraction phanso1 = new Fraction();
        Fraction phanso2 = new Fraction();
        Scanner sc = new Scanner(System.in);
        System.out.println("tu so thu 1:");
        phanso1.setTuSo(sc.nextInt());
        System.out.println("mau so thu 1:");
        phanso1.setMauSo(sc.nextInt());
        System.out.println("tu so thu 2:");
        phanso2.setTuSo(sc.nextInt());
        System.out.println("mau so thu 2:");
        phanso2.setMauSo(sc.nextInt());
        System.out.println("Phan so 1 vua nhap la: " + Math.abs(phanso1.getTuSo()) + "/" + Math.abs(phanso1.getMauSo()));
        System.out.println("Phan so 2 vua nhap la: " + phanso2.getTuSo() + "/" + phanso2.getMauSo());
        System.out.println("Rut gon phan so 1: ");
        phanso1.Rutgon();
        System.out.println("Rut gon phan so 2: ");
        phanso2.Rutgon();
        System.out.println("Ngich dao phan so 1: " + phanso1.getMauSo() + "/" + phanso1.getTuSo());
        System.out.println("Ngich dao phan so 2: " + phanso2.getMauSo() + "/" + phanso2.getTuSo());
    }
}
