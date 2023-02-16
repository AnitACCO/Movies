package com.movieplatform.movie.repository;

import com.movieplatform.movie.models.TransactionData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionData, Integer> {
}
