package com.nowcoder.community.elasticsearch;

import com.nowcoder.community.entity.DiscussPost;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

//针对数据访问层的注解
@Repository
public interface DiscussPostRepository extends ElasticsearchRepository<DiscussPost,Integer> {


}
