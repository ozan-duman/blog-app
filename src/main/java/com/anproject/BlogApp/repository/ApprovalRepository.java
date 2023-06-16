package com.anproject.BlogApp.repository;

import com.anproject.BlogApp.entity.Approval;
import com.anproject.BlogApp.entity.News;
import com.anproject.BlogApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ApprovalRepository extends JpaRepository<Approval, Long> {

    Approval getApprovalById(long id);

    List<News> getApprovalByNews(News news);

    List<User> getApprovalByUser(User user);

}
