package lt.codeacademy.api.security.dto;

import lombok.Data;

@Data
public class Login {
    private String username;
    private String password;
}
