package lt.codeacademy.api.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;
@Getter
@AllArgsConstructor
public class PostNotFoundException extends RuntimeException{
    private final UUID id;
}
