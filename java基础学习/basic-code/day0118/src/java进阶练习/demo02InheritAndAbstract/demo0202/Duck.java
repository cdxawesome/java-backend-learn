package java进阶练习.demo02InheritAndAbstract.demo0202;

public class Duck extends Poultry
{
    public Duck()
    {
    }

    public Duck(String name, String symptom, int age, String illness)
    {
        super(name, symptom, age, illness);
    }

    @Override
    public void showSymptom()
    {

        System.out.println("症状为:" + getSymptom());
    }
}
