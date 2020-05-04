package com.soapwbservice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.soapwbservice.entity.MovieEntity;


@Repository
public interface MovieEntityRepository extends CrudRepository<MovieEntity, Long> {

	public MovieEntity findByTitle(String title);
}