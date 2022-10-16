package com.example.insorma.databaseSet;

import com.example.insorma.R;
import com.example.insorma.modelSet.Furniture;
import com.example.insorma.modelSet.UserSession;

import java.util.Vector;

public class Databases {
    private static Vector<UserSession> UserList = new Vector<>();
    private static UserSession UserLogin = null;
    private Vector<Furniture> furnitures = new Vector<Furniture>();

    public Databases(){
        furnitures.add(new Furniture("Kursi Sofa", "4.9", "Rp1.535.000", R.drawable.pic1));
        furnitures.add(new Furniture("Kursi Kantor", "4.6", "Rp459.000", R.drawable.pic2));
        furnitures.add(new Furniture("Meja Belajar", "4.8", "Rp868.000", R.drawable.pic3));
        furnitures.add(new Furniture("Hiasan Dinding", "4.9", "Rp199.000", R.drawable.pic4));
        furnitures.add(new Furniture("Tempat Bunga", "4.7", "Rp269.000", R.drawable.pic5));
    }

    public Vector<Furniture> getFurnitures() {
        return furnitures;
    }

    public void setFurnitures(Vector<Furniture> furnitures) {
        this.furnitures = furnitures;
    }

    public static Vector<UserSession> getUserList() {

        return UserList;
    }

    public static void setUserList(Vector<UserSession> userList) {

        Databases.UserList = userList;
    }

    public static UserSession getUserLogin() {
        return UserLogin;
    }

    public static void setUserLogin(UserSession userLogin) {
        UserLogin = userLogin;
    }
}
