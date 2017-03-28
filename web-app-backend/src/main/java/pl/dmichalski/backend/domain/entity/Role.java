package pl.dmichalski.backend.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Data
public class Role {

    @Id
    @SequenceGenerator(name="role_id_seq", sequenceName="role_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator="role_id_seq")
    private Integer id;

    private String name;

}
