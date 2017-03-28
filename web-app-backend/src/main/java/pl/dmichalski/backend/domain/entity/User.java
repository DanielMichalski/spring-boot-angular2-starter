package pl.dmichalski.backend.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "web_user")
@Getter
@NoArgsConstructor
public class User {

    @Id
    @SequenceGenerator(name="web_user_id_seq", sequenceName="web_user_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator="web_user_id_seq")
    private Integer id;

    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name = "web_user_x_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> userRoles;

}
