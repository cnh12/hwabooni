package com.postit.hwabooni.model;

import com.google.firebase.firestore.DocumentId;


public class FriendData {

    @DocumentId
    String id;
    String name;
    String plantImage;
    int type;
    String emotion;
    String phone;
    long time;
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlantImage() {
        return plantImage;
    }

    public void setPlantImage(String plantImage) {
        this.plantImage = plantImage;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion= emotion;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setPhoneNumber(String phone){this.phone=phone;}

    public String getPhone() {
        return phone;
    }

    public FriendData(String name) {
        this.name = name;
    }

    public FriendData() {
    }

    public FriendData(String name, String plantImage, String emotion, String phone) {
        this.name = name;
        this.plantImage = plantImage;
        this.emotion = emotion;
        this.phone = phone;
    }
}
