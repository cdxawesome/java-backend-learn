package java进阶练习.demo02InheritAndAbstract.demo0204;

import java.util.ArrayList;

public class Demo0204Main
{
    public static void main(String[] args)
    {
        SUV suv1 = new SUV("长城", 5079, 75000);
        SUV suv2 = new SUV("福特", 4813, 120000);
        SUV suv3 = new SUV("广汽", 4270, 80000);
        SUV suv4 = new SUV("奔驰", 4545, 188000);
        ArrayList<SUV> suvCars = new ArrayList<>();
        suvCars.add(suv1);
        suvCars.add(suv2);
        suvCars.add(suv3);
        suvCars.add(suv4);

        for (SUV suvCar : suvCars)
        {
            if (suvCar.judgeType() == 2)
                suvCar.showMsg();
        }
    }
}
