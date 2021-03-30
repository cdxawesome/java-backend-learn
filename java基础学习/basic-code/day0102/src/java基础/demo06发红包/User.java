package java基础.demo06发红包;

public abstract class User
{
    private String name;
    private int totalMoney;
    static int userCount;

    public User(String name, int totalMoney)
    {
        userCount++;
        this.name = name;
        this.totalMoney = totalMoney;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setTotalMoney(int totalMoney)
    {
        this.totalMoney = totalMoney;
    }

    public String getName()
    {
        return name;
    }

    public int getTotalMoney()
    {
        return totalMoney;
    }

    static
    {
        userCount = 0;
    }

    public User()
    {
        userCount++;
    }
}
