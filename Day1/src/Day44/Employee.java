package Day44;

public class Employee {
    private String name;
    private byte age;
    private boolean gender;

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Employee(String name, byte age){
        this.name = name;
        setAge(age);
    }

    public Employee(String name, byte age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if(age > 0){
            this.age = age;
        }

    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void printEmployee(){

    }

}
