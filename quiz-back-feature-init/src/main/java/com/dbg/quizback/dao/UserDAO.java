package com.dbg.quizback.dao;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.dbg.quizback.model.User;

@Repository
public interface UserDAO extends PagingAndSortingRepository<User, Integer> {

	Optional<User> findOneByNameOrderByIdUserDesc(String name);

}
