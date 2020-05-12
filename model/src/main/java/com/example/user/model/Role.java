package com.example.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Role
 * @Author Role
 * @Date 2020/5/10 0010 14:56
 * @Ps  @Data---以下注解的集合：@ToString @EqualsAndHashCode @Getter @Setter @RequiredArgsConstructor
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role implements Serializable {

    private Integer id;
    private String name;

}
