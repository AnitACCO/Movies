package com.movieplatform.movie.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transactionData")
public class TransactionData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int transaction_id;

    @Column(name = "movies_name")
    String movies_name;

    @CreationTimestamp
    private Date createdTime;

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getMovies_name() {
        return movies_name;
    }

    public void setMovies_name(String movie_name) {
        this.movies_name = movie_name;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
