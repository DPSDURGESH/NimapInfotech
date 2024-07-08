package com.OneToManyRelation.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.OneToManyRelation.Model.Category;



@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

	Page<Category> findAll(Pageable pageable);
}
