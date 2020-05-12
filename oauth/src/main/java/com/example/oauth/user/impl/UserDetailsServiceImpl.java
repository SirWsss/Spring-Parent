package com.example.oauth.user.impl;

import com.example.oauth.fegin.UserFegin;
import com.example.user.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName UserDetailsServiceImpl
 * @Author UserDetailsServiceImpl
 * @Date 2020/5/10 0010 16:14
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserFegin userFegin;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.example.user.model.User user = userFegin.getUser(username);
        if (user != null){
            //return new User(user.getUsername(),user.getPassword(), AuthorityUtils.createAuthorityList(user.getRoles()));
            return new User(user.getUsername(),user.getPassword(), getGrantedAuthorities(user));
        }else {
            throw  new UsernameNotFoundException("用户["+username+"]不存在");
        }
    }

    private Collection<? extends GrantedAuthority> getGrantedAuthorities(com.example.user.model.User user) {
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        for (Role role : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
        }
        return authorities;
    }
}
