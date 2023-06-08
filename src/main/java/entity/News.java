package entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "contents")
    private String contents;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "status")
    private boolean status;

    @ManyToMany(mappedBy = "categories")
    private List<News> news = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @OneToMany(mappedBy = "newsId")
    private List<Paraphrase> paraphrases = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.DETACH)
    @JoinTable(name = "caterogies_news",
            joinColumns = @JoinColumn(name = "news_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id"))
    private List<Category> categories = new ArrayList<>();

    @OneToMany(mappedBy = "newsId")
    private List<Media> medias = new ArrayList<>();

    @OneToMany(mappedBy = "newsId")
    private List<Approval> approvals = new ArrayList<>();

    @OneToOne(mappedBy = "newsId")
    private Slider slider;
}
