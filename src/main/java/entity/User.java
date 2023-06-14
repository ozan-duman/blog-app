package entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "status")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role roleId;

    @OneToMany(mappedBy = "userId")
    private List<News> news = new ArrayList<>();

    @OneToMany(mappedBy = "userId")
    private List<Paraphrase> paraphrases = new ArrayList<>();

    @OneToMany(mappedBy = "userId")
    private List<Approval> approvals = new ArrayList<>();

    @OneToMany(mappedBy = "userId")
    private List<Slider> sliders = new ArrayList<>();

}
