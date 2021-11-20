package com.example.shareworkout;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject {
    //######### defining key that define on the ParseDashboard##########
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE ="image";
    public static final String KEY_TITLE ="title";
    public static final String KEY_CREATED_KEY ="createdAt";
    public static final String KEY_USER = "user";

    //########## Setup the geter and seter for each attribute on the post #####

    public static String getDescription() {
        return KEY_DESCRIPTION;
    }
    public void setDescription(String description){put(KEY_DESCRIPTION,description);}

    public static String getImage() {
        return KEY_IMAGE;
    }
    public void setImage(ParseFile parseFile) {put(KEY_IMAGE,parseFile);}

    public static String getTitle() {
        return KEY_TITLE;
    }
    public void setTitle(String title){put(KEY_TITLE,title);}

    public static String getUser() {
        return KEY_USER;
    }
    public void setUser(ParseUser user){put(KEY_USER,user);}
}
