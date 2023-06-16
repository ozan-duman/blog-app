package com.anproject.BlogApp.repository;

import com.anproject.BlogApp.entity.Media;
import com.anproject.BlogApp.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MediaRepository extends JpaRepository<Media, Long> {

    Media getMediaById(Media id);
    List<News> getMediaByNews(News news);
}
