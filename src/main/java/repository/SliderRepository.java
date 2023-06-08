package repository;

import entity.News;
import entity.Slider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SliderRepository extends JpaRepository<Slider, Long> {

    Slider getSliderById(long id);
    List<News> getSliderByNews(News news);

}
