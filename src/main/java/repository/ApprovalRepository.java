package repository;

import entity.Approval;
import entity.News;
import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ApprovalRepository extends JpaRepository<Approval, Long> {

    Approval getApprovalById(long id);

    List<News> getApprovalByNews(News news);

    List<User> getApprovalByUser(User user);

}
