package repository;

import entity.News;
import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News,Long> {

    News getNewsById (long id);

    List<User> getSliderByUser(User user);

    List<News> getSliderByNews(News news);
}
