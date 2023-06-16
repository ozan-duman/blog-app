package com.anproject.BlogApp.repository;

import com.anproject.BlogApp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {



}
