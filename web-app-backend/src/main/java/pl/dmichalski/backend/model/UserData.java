package pl.dmichalski.backend.model;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class UserData {

    private String firstName;
    private String lastName;
    private Set<String> roles;

}
