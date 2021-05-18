package springbootsemigram.semigram.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountOwnerId;
    @Column
    private String username;
    private String email;
    private String phoneNumber;
    // private Image profilePicture;
    private String profilePicture;
    private LocalDate dateCreated;
}
