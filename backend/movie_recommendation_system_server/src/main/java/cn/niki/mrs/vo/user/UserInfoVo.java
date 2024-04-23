package cn.niki.mrs.vo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoVo {
    private Long id;

    private String username;

    private String nickname;

    private String avatar;

    private String sex;
}
