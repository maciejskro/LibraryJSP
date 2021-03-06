package pl.sda.library.service;


import pl.sda.library.dto.BorrowerDTO;
import pl.sda.library.entity.Borrower;
import pl.sda.library.model.BorrowerRepository;
import pl.sda.library.model.IBaseRepository;

import java.util.List;

public class BorrowerService implements IBorrowerService {

    private IBaseRepository<Borrower> borrowerRepository;

    public BorrowerService() {

        this.borrowerRepository = new BorrowerRepository();
    }

    @Override
    public BorrowerDTO getLoggedUser(String usr, String pass, Boolean lost) {
        BorrowerDTO result;
        List<Borrower> listBorrower =  borrowerRepository.findAll();
        Borrower matchuser = null;
        if( listBorrower != null) {
        matchuser = listBorrower.stream()
                .filter( (b) -> usr.equals(b.getUsername()) & pass.equals(b.getPasswd() ) )
                .findAny()
                .orElse(null); }
                else { return null; }
        try {
            result = new BorrowerDTO(matchuser.getUsername(), matchuser.getPasswd());
            result.setFirstName( matchuser.getFirstName());
            result.setLastName( matchuser.getLastName() );
        } catch ( Exception e) {
            result = null;
        }
        return result;
    }
}
