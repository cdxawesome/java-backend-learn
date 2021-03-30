package java进阶练习.demo02InheritAndAbstract.demo0204;

public class Auto
{
    private String brand;
    private double length;
    private int price;

    public Auto()
    {
    }

    public Auto(String brand, double length, int price)
    {
        this.brand = brand;
        this.length = length;
        this.price = price;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public void showMsg()
    {
        System.out.println("品牌:" + brand);
        System.out.println("价格:" + price);
        System.out.println("车长:" + length);
    }
}
