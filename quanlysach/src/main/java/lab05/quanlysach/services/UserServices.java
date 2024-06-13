package lab05.quanlysach.services;


import lab05.quanlysach.entity.User;
import lab05.quanlysach.repository.IRoleRepository;
import lab05.quanlysach.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IRoleRepository roleRepository;
    public void save(User user){
        userRepository.save(user);
        Long userId = userRepository.getUserIdByUsername(user.getUsername());
        Long roleId = roleRepository.getRoleIdByName("USER");
        if(roleId != 0 && userId !=0 ){
            userRepository.addRoleToUser(userId, roleId);
        }
    }
}
