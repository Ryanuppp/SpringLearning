package com.AdSpy.entity;

public class Advertisement {
    private int id ;
    private int creatorId;
    private String category;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }



    @Override
    public String toString() {
        return "Advertisement{" +
                "id=" + id +
                ", creatorId=" + creatorId +
                ", category='" + category + '\'' +
                '}';
    }

}
