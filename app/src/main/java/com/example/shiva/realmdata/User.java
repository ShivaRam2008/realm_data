package com.example.shiva.realmdata;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;

/**
 * Created by shiva on 6/25/2017.
 */

public class User extends RealmObject {
    String name;
    int ph;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return ph;
    }

    public void setAge(int ph) {
        this.ph = ph;
    }


}
