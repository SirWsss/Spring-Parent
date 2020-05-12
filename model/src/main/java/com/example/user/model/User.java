package com.example.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName User
 * @Author User
 * @Date 2020/5/10 0010 14:46
 * @Ps  @Data---以下注解的集合：@ToString @EqualsAndHashCode @Getter @Setter @RequiredArgsConstructor
 *        @NoArgsConstructor---无参构造函数
 *          @AllArgsConstructor---全参构造函数
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private Set<Role> roles = new HashSet<Role>();
    private Date createTime;

}
