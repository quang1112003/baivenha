package Fraction;

public class Fraction {
    private int tuSo;
    private int mauSo;
    public  Fraction(){
        this.tuSo = tuSo;
        this.mauSo= mauSo;
    }
    public int getTuSo() {
        return tuSo;
    }
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }
    public int getMauSo() {
        return mauSo;
    }
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    public void Rutgon(){
        int a = tuSo;
        int b = mauSo;
        int c = a % b;
        while ( c != 0){
            a = b;
            b = c;
            c = a % b;
        }
        tuSo /= b;
        mauSo /= b;
        if (mauSo == 1)
        {
            System.out.println("Rut gon:" + tuSo);
        }
        else
        {
            System.out.println("Rut gon:" + tuSo + "/" + mauSo);
        }
    }
    public void Ngichdao(){
        int nd = tuSo;
        tuSo= mauSo;
        mauSo= nd;
    }
}
