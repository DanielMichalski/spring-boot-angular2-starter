package pl.dmichalski.backend.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import pl.dmichalski.backend.util.EntityConstants;

@Entity
@Data
public class Role {

    @Id
    @GeneratedValue(generator = EntityConstants.ID_GENERATOR_NAME)
    private Long id;

    private String name;

}
