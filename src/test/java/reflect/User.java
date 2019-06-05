package reflect;

import java.util.Date;

/**
 * Created by Administrator on 2018/11/9.
 */
public class User {

    public  User(){}

    public User(int age,String name){
        this.age = age;
        this.name = name;
    }

    private String name;
    private int age;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String                                                                                                                                                                                                                                              name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
