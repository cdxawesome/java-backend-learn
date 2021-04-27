package com.rico.repository;

import com.rico.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MyRepository extends ElasticsearchRepository<User, Long> {

    /**
     * 根据id或者年龄或者名字查询
     * @param id
     * @param age
     * @param name
     * @return
     */
    User findByIdOrAgeOrName(Long id, Integer age, String name);

    /**
     * 删除年龄大于或等于给定值的数据
     * @param age
     */
    void deleteByAgeGreaterThanEqual(Integer age);

    /**
     * 搜索指定年龄段的user
     * @param start 开始年龄
     * @param end 结束年龄
     * @return
     */
    User findAllByAgeBetween(int start,int end);


}
