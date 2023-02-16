package com.movieplatform.movie.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Movietable")
public class MovieData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movie_Id;

    @Column(name = "movie_name")
    private String movie_name;

    @Column(name = "price")
    private long price;

    @CreationTimestamp
    private Date createdTime;

    public long getMovie_Id() {
        return movie_Id;
    }

    public void setMovie_Id(int movie_Id) {
        this.movie_Id = movie_Id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}