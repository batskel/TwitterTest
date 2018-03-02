package com.database;
// Generated Mar 1, 2018 1:28:15 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Posttelegram generated by hbm2java
 */
@Entity
@Table(name="posttelegram"
    ,catalog="twitter01"
)
public class Posttelegram  implements java.io.Serializable {


     private int idPost;
     private Integer likes;
     private Integer unlikes;
     private byte[] replyKeyboardObject;
     private Set<Userlikse> userlikses = new HashSet<Userlikse>(0);

    public Posttelegram() {
    }

	
    public Posttelegram(int idPost) {
        this.idPost = idPost;
    }
    public Posttelegram(int idPost, Integer likes, Integer unlikes, byte[] replyKeyboardObject, Set<Userlikse> userlikses) {
       this.idPost = idPost;
       this.likes = likes;
       this.unlikes = unlikes;
       this.replyKeyboardObject = replyKeyboardObject;
       this.userlikses = userlikses;
    }
   
     @Id 

    
    @Column(name="id_post", unique=true, nullable=false)
    public int getIdPost() {
        return this.idPost;
    }
    
    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    
    @Column(name="likes")
    public Integer getLikes() {
        return this.likes;
    }
    
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    
    @Column(name="unlikes")
    public Integer getUnlikes() {
        return this.unlikes;
    }
    
    public void setUnlikes(Integer unlikes) {
        this.unlikes = unlikes;
    }

    
    @Column(name="replyKeyboardObject")
    public byte[] getReplyKeyboardObject() {
        return this.replyKeyboardObject;
    }
    
    public void setReplyKeyboardObject(byte[] replyKeyboardObject) {
        this.replyKeyboardObject = replyKeyboardObject;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="posttelegram")
    public Set<Userlikse> getUserlikses() {
        return this.userlikses;
    }
    
    public void setUserlikses(Set<Userlikse> userlikses) {
        this.userlikses = userlikses;
    }




}


