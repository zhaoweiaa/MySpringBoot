package cn.jxau.zhaowei.myspringboot.Modal;

import lombok.*;

/**
 * @ClassName Staff
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/8/29 18:30
 * @Version 1.0
 */
@ToString
@EqualsAndHashCode(of={"id"})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Staff {
    @NonNull
    private String id;
    @NonNull
    private String name;
    @NonNull
    private int age;

}
