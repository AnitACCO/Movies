package com.movieplatform.movie.services;

import com.movieplatform.movie.exception.MovieException;
import com.movieplatform.movie.models.MovieData;
import com.movieplatform.movie.models.TransactionData;
import com.movieplatform.movie.repository.MovieRepository;
import com.movieplatform.movie.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MovieServicesImp implements MovieServices {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<MovieData> getAllMoives() {
        return this.movieRepository.findAll();
    }

    @Override
    public MovieData getMovie(int id) {
        Optional<MovieData> mObj = this.movieRepository.findById(id);
        if(mObj.isPresent()){
            return mObj.get();
        }
        else {
            throw new MovieException("No Product found with id " + id);
        }
    }

    @Override
    public TransactionData getTransactionDetails(int id) {
        Optional<TransactionData> tObj = this.transactionRepository.findById(id);
        if(tObj.isPresent()){
            return tObj.get();
        }
        else {
            throw new MovieException("No Product found with id " + id);
        }
    }

    @Override
    public TransactionData postTransactionDetails(int moive_id) {
        MovieData m = getMovie(moive_id);
        TransactionData t = new TransactionData();
        t.setMovies_name(m.getMovie_name());
        return transactionRepository.save(t);
    }
}
