package product;

public abstract class product {
    public product(String Productor, int x) {
        SerialNumber = x;
        this.Productor = Productor;
    }

    String Productor;
    int SerialNumber;

    public void process() {
    }// 不知道什么意思

    public void display() {
        System.out.println("Serial Number:" + SerialNumber + " " + "Produtor:" + Productor + " " + getClass().getName()
                + "'s data is " + getdata());
    }
    protected abstract double getdata();
}
