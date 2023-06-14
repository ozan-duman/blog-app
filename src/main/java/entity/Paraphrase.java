package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "paraphrase")
public class Paraphrase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "contents")
    private String contents;
    @Column(name = "created_date")
    private Date createdDate;


    @ManyToOne
    @JoinColumn(name = "news_id")
    private News newsId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;


}
