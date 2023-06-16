package com.anproject.BlogApp.repository;

import com.anproject.BlogApp.entity.News;
import com.anproject.BlogApp.entity.Paraphrase;
import com.anproject.BlogApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParaphraseRepository extends JpaRepository<Paraphrase, Long> {

    Paraphrase getParaphraseById(long id);
    List<News> getParaphraseByNews(News news);
    List<User> getParaphraseByUser(User user);


}
