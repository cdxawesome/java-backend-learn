package java进阶复习.demo06Exercise;

public class User
{
    private String user_name;
    private String password;

    public User(String user_name, String password)
    {
        this.user_name = user_name;
        this.password = password;
    }

    public String getUser_name()
    {
        return user_name;
    }

    /*传入一个密码，判断是否和当前对象密码一致*/
    public boolean isPasswordCorrect(String password)
    {
        return this.password.equals(password);
    }
}
