package cn.niki.mrs.vo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginUserVo {

    private String token;
    private UserInfoVo userInfo;
}
