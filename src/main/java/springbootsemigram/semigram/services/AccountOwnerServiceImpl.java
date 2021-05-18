package springbootsemigram.semigram.services;

import springbootsemigram.semigram.dtos.AccountOwnerDTO;
import springbootsemigram.semigram.exceptions.AccountOwnerException;
import springbootsemigram.semigram.exceptions.verificationException;
import springbootsemigram.semigram.models.AccountOwner;

import java.util.List;

public class AccountOwnerServiceImpl implements AccountOwnerService {
    @Override
    public void CreateOwner(AccountOwnerDTO accountOwnerDTO) {

    }

    @Override
    public void confirmEmail(String verificationToken) throws AccountOwnerException, verificationException {

    }

//    @Override
//    public void listPhoneNumber(String phoneNumber) {
//
//    }

    @Override
    public void confirmUsername(String username) throws AccountOwnerException, verificationException {

    }

    @Override
    public boolean accountOwnerExists(String email) {
        return false;
    }

    @Override
    public boolean accountOwnerEmailExists(String email) throws AccountOwnerException {
        return false;
    }

    @Override
    public AccountOwner internalGetAccountOwnerByUsername(String username) {
        return null;
    }

    @Override
    public List<AccountOwnerDTO> getAllAccountOwners() {
        return null;
    }

    @Override
    public AccountOwnerDTO getAccountOwnersById(long id) throws AccountOwnerException {
        return null;
    }

    @Override
    public AccountOwnerDTO getAccountOwnersByUsername(String email) throws AccountOwnerException {
        return null;
    }

//    @Override
//    public AccountOwner internalSaveAccountOwner(String username) {
//        return null;
//    }

//    @Override
//    public AccountOwnerDTO getAccountOwnersByEmail(String email) throws AccountOwnerException {
//        return null;
//    }
}
