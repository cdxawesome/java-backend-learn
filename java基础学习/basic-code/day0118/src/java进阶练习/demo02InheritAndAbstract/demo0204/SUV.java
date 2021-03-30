package java进阶练习.demo02InheritAndAbstract.demo0204;

public class SUV extends Auto
{
    private final double smallCarStandardLength = 4295;
    private final double middleCarStandardLength = 5070;

    public SUV()
    {
    }

    public SUV(String brand, double length, int price)
    {
        super(brand, length, price);
    }

    /**
     * 根据车长判断车辆类型。小型车返回1，中型车返回2，大型车返回3
     **/
    public int judgeType()
    {
        if (getLength() < smallCarStandardLength)
            return 1;
        else if (getLength() > middleCarStandardLength)
            return 3;
        else if (getLength() > smallCarStandardLength && getLength() <= middleCarStandardLength)
            return 2;

        return -1;
    }
}
