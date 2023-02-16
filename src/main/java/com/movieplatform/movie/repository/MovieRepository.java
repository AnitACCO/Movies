package com.movieplatform.movie.repository;

import com.movieplatform.movie.models.MovieData;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface MovieRepository extends JpaRepository<MovieData,Integer> {
}
