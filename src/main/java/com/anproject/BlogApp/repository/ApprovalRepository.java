package com.anproject.BlogApp.repository;

import com.anproject.BlogApp.entity.Approval;
import com.anproject.BlogApp.entity.News;
import com.anproject.BlogApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApprovalRepository extends JpaRepository<Approval, Long> {

    Approval getApprovalById(long id);

    List<Approval> getApprovalByNews(News news);

    List<Approval> getApprovalByUser(User user);

}
