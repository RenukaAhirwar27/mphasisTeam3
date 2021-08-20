package com.mphasis.main.cui;

import java.io.*;

class Person implements Serializable{
    private static final long serialVersionUID =2l;
    int Id;
    String name;
    int age;
    transient int value;

    public Person(int id, String name, int age, int value) {
        Id = id;
        this.name = name;
        this.age = age;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", value=" + value +
                '}';
    }
}
public class Main {

    public static void main(String[] args) {
        Person person = new Person(1,"joe",34,23);

        try (FileOutputStream fileOutputStream = new FileOutputStream("ObjectStore.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            FileInputStream fileInputStream = new FileInputStream("ObjectStore.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){

            objectOutputStream.writeObject(person); //serialization

            Object object = objectInputStream.readObject();  //deserialization

            System.out.println(object);

        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
