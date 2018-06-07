package pl.sda.library.service;

import pl.sda.library.dto.BorrowerDTO;

public interface IBorrowerService  {

    BorrowerDTO getLoggedUser( String usr , String pass, Boolean lostpass);

}
