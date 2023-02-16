package com.movieplatform.movie.services;

import com.movieplatform.movie.models.MovieData;
import com.movieplatform.movie.models.TransactionData;

import java.util.List;

public interface MovieServices {
    List<MovieData> getAllMoives();
    MovieData getMovie(int id);
    TransactionData getTransactionDetails(int id);
    TransactionData postTransactionDetails(int movie_id);
}
