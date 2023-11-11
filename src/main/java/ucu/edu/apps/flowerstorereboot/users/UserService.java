package ucu.edu.apps.flowerstorereboot.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepositoryCurrent) {
        this.userRepository = userRepositoryCurrent;
    }
    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(AppUser user) {
        userRepository.save(user);
    }
}