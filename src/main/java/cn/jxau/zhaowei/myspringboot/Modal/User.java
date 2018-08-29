package cn.jxau.zhaowei.myspringboot.Modal;

import lombok.*;

/**
 * @ClassName User
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/8/29 21:23
 * @Version 1.0
 */
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @NonNull
    private long id;
    private String username;
    private String password;
}
