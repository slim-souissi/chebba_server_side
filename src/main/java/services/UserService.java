package services;

import javax.transaction.Transactional;

import org.sid.model.User;
import org.sid.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

	@Autowired UserRepository userRepository ;
	
	public User save(User user) {
		return userRepository.save(user) ;
	}
}
