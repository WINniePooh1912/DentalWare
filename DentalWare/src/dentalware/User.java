package dentalware;

public class User {
    private String name;
    private int age;
    private char sex;
    private String address;
    private String telephone;
    private String user;
    private String password;
    private int type;

    public User() { }    
    public User(String name, int age, char sex, String address, 
            String telephone, String user, String password, int type) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.telephone = telephone;
        this.user = user;
        this.password = password;
        this.type = type;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
        
}
