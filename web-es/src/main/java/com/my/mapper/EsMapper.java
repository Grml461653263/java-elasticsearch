package com.my.mapper;

import com.my.pojo.Like;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EsMapper extends ElasticsearchRepository<Like,Long> {
}
