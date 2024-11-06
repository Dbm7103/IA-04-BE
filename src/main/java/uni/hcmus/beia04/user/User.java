package uni.hcmus.beia04.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.sql.ConnectionBuilder;
import java.util.Date;

/**
 * Represents a user entity in the MongoDB database.
 *
 * @author <a href="mailto:21120439@student.hcmus">Bùi Minh Duy</a>
 */
@Document(collection = "users")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotBlank
    @Indexed(unique = true)
    @Email
    private String email;

    @NotBlank
    private String password;

    @CreatedDate
    private Date createdAt = new Date();

}