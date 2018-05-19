package kg.iceknight.service.impl;

import kg.iceknight.enums.Role;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collections;

//@Service
public class DefaultUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = new User(email, "password",
                true,
                true,
                true,
                true,
                Collections.singletonList(new SimpleGrantedAuthority(Role.ADMIN.name())));

        return null;
    }

}
