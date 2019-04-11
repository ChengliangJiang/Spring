package jcl.model;

import java.util.List;

public class Customer {
    private String name;
    private String sex;
    private Adress adress;
    private List<String> car;

    public void setCar(List<String> car) {
        this.car = car;
    }

    public List<String> getCar() {
        return car;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", adress=" + adress +
                '}';
    }
}
