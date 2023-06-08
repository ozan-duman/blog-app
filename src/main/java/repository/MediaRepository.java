package repository;

import entity.Media;
import entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MediaRepository extends JpaRepository<Media, Long> {

    Media getMediaById(Media id);
    List<News> getMediaByNews(News news);
}
