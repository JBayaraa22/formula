package com.bayarjargal.me.formula.model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by User on 4/22/2019.
 */

public class Category {
    private int ID;
    private String name;

    public Category(){
        ID = 0;
        name = "";
    }

    public Category(JSONObject data){
        try {
            ID = data.getInt("id");
            name = data.getString("name");
        } catch (JSONException e) {
            ID = 0;
            name = "";
            e.printStackTrace();
        }
    }
}
