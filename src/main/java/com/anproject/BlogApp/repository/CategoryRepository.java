package com.anproject.BlogApp.repository;

import com.anproject.BlogApp.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    @Query("SELECT c FROM Category c ORDER BY c.id")
    List<Category> findAllByIdAsc();

    @Query("SELECT c FROM Category c ORDER BY c.id")
    Page<Category> findAllCategoriesWithOptional(Pageable pageable);

}
