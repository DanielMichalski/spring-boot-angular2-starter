package pl.dmichalski.backend.domain.entity;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.dmichalski.backend.util.EntityConstants;

@Entity
@Table(name = "web_user")
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(generator = EntityConstants.ID_GENERATOR_NAME)
    private Long id;

    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name = "web_user_x_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> userRoles;

}
