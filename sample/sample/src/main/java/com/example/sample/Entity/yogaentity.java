package com.example.sample.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//To use the @Data annotation you should add the Lombok dependency.

@Entity
// @Table(name="book")
public class yogaentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
     private String img;
    private String description;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String img() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public yogaentity(int id, String title, String img, String description) {
        this.id = id;
        this.title = title;
        this.img = img;
        this.description = description;
    }
    
    public yogaentity(){

    }
    
   
    
}