package com.anproject.BlogApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "slider")
public class Slider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean status;
    private String imageUrl;

    @OneToOne
    @JoinColumn(name = "news_id")
    private News newsId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;
}
