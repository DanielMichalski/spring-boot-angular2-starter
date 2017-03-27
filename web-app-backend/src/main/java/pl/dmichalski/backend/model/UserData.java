package pl.dmichalski.backend.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserData {

    private String firstName;
    private String lastName;

}
