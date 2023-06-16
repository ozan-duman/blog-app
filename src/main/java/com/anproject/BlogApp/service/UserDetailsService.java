package service;

import entity.Role;
import entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String nickname) throws UsernameNotFoundException {
        User user = userRepository.getUserByNickname(nickname);

        if(user != null){
            return new org.springframework.security.core.userdetails.User(user.getNickname(),
                    user.getPassword(),
                    mapRolesAuthorities((Collection<Role>) user.getRoleId()));
        }else{
            throw new UsernameNotFoundException("Kullanıcı adı veya şifre bulunamadı.");
        }

    }

    private Collection< ? extends GrantedAuthority> mapRolesAuthorities(Collection <Role> roles){
        Collection < ? extends GrantedAuthority> mapRoles = roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getRoleName()))
                .collect(Collectors.toList());
        return mapRoles;
    }
}
