package com.example.oop.basics;

class DBConnection {

    private static DBConnection instance;

    private DBConnection() {

    }
    public static DBConnection getInstance() {
        if(instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public void getFromDB() {
        System.out.println("dane z bazy");
    }

}

public class SingletonExample {
    public static void main(String[] args) {

        DBConnection conection1 = DBConnection.getInstance();
        DBConnection conection2 = DBConnection.getInstance();

        conection2.getFromDB();

        System.out.println(conection1 == conection2);


    }
}
