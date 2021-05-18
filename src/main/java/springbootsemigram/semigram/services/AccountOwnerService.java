package springbootsemigram.semigram.services;

import springbootsemigram.semigram.dtos.AccountOwnerDTO;
import springbootsemigram.semigram.exceptions.AccountOwnerException;
import springbootsemigram.semigram.exceptions.verificationException;
import springbootsemigram.semigram.models.AccountOwner;

import java.util.List;

public interface AccountOwnerService {
    void CreateOwner(AccountOwnerDTO accountOwnerDTO);
    void confirmEmail(String verificationToken) throws AccountOwnerException, verificationException;
    void confirmUsername(String username) throws AccountOwnerException, verificationException;
    boolean accountOwnerExists(String email);
    boolean accountOwnerEmailExists(String email) throws AccountOwnerException;

    AccountOwner internalGetAccountOwnerByUsername(String username);
    List<AccountOwnerDTO> getAllAccountOwners();
    AccountOwnerDTO getAccountOwnersById(long id) throws AccountOwnerException;
    AccountOwnerDTO getAccountOwnersByUsername(String email) throws AccountOwnerException;
    // AccountOwner internalSaveAccountOwner(String username);
}
