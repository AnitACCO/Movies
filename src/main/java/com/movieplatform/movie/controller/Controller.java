package com.movieplatform.movie.controller;

import com.movieplatform.movie.models.MovieData;
import com.movieplatform.movie.models.TransactionData;
import com.movieplatform.movie.services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.movieplatform.movie.services.MovieServices;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private MovieServices movieServices;

    @GetMapping("/movies")
    private ResponseEntity<List<MovieData>> getAllProduct(){
        return ResponseEntity.ok().body(this.movieServices.getAllMoives());
    }

    @GetMapping("/movie/{movie_id}")
    private MovieData getMovieById(@PathVariable int movie_id){
        return this.movieServices.getMovie(movie_id);
    }

    @GetMapping("/transaction/{transaction_id}")
    private TransactionData getTransactionById(@PathVariable int transaction_id){
        return this.movieServices.getTransactionDetails(transaction_id);
    }

    @PostMapping("/pay/{movie_id}")
    private ResponseEntity<TransactionData> saveProduct(@PathVariable int id){
        return ResponseEntity.ok().body(this.movieServices.postTransactionDetails(id));
    }
}
