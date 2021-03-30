package java基础.demo01;

public class Demo0101Main
{
    public static void main(String[] args)
    {
        Hero hero=new Hero();
        hero.setName("工程师");
        hero.setSkill(new Skill()
        {
            @Override
            public void useSkill()
            {
                System.out.println("放炮台!啪啪啪啪");
            }
        });

        hero.attack();
    }
}
