package com.ricorich.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "tb_user") // 指定要查询哪一个表
public class User {
    // 指定这个属性是主键id
    @Id
    // 设置主键回填。也就是在插入操作时将数据库自动生成的id回填到此属性值上
    @KeySql(useGeneratedKeys = true)
    private Long id;
    /*这个注解指定将列映射到这个属性上。如果你写的属性名和数据表的列名完全一致，
    * 或者是符合驼峰命名规范(user_name-->userName),那么这个注解可以不用写*/
    //@Column(name = "abc")
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private String note;
    private Date created;
    private Date updated;

}
