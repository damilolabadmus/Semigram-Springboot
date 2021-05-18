package springbootsemigram.semigram.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import springbootsemigram.semigram.models.AccountOwner;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountOwnerDTO {
    @NotNull(message = "Please provide the owner id")
    private long ownerId;
    @NotNull(message = "Email cannot be blank")
    @Email(message = "Email must be valid email")
    private String email;
    @NotNull(message = "Please provide a username")
    private String username;
    @NotNull(message = "Phone number cannot be blank")
    private String phoneNumber;
    private String profilePicture;
    private LocalDate dateCreated;

    public static AccountOwner unpackDTO(AccountOwnerDTO dto) {
        AccountOwner accountOwner = new AccountOwner();
        accountOwner.setEmail(dto.getEmail());
        accountOwner.setUsername(dto.getUsername());
        accountOwner.setPhoneNumber(dto.getPhoneNumber());
        accountOwner.setProfilePicture(dto.getProfilePicture());
        accountOwner.setDateCreated(dto.getDateCreated());
        return accountOwner;
    }

    public static AccountOwnerDTO packDTO(AccountOwner accountOwner) {
        AccountOwnerDTO accountOwnerDTO  = new AccountOwnerDTO();
        accountOwnerDTO.setEmail(accountOwner.getEmail());
        accountOwnerDTO.setUsername(accountOwner.getUsername());
        accountOwnerDTO.setPhoneNumber(accountOwner.getPhoneNumber());
        accountOwnerDTO.setProfilePicture(accountOwner.getProfilePicture());
        return accountOwnerDTO;
    }
}
