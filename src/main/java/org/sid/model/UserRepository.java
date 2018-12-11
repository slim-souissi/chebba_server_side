package org.sid.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

public interface UserRepository  extends JpaRepository<User, Long>{

}
