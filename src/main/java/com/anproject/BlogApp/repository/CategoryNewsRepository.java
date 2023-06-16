package com.anproject.BlogApp.repository;

import com.anproject.BlogApp.entity.Category;
import com.anproject.BlogApp.entity.CategoryNews;
import com.anproject.BlogApp.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryNewsRepository extends JpaRepository<CategoryNews, Long> {

    List<CategoryNews> getCategoryNewsByCategory(Category category);

    List<CategoryNews> getCategoryNewsByNews(News news);
}
