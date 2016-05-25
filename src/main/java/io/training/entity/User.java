package io.training.entity;

import org.elasticsearch.index.store.Store;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;

/**
 * Created by percy on 5/24/16.
 */
@Document(indexName = "training-es", type = "user", shards = 5, replicas = 0, refreshInterval = "-1")
public class User {
    @Id
    private Long id;
    @Field(store = true, index = FieldIndex.not_analyzed)
    private String name;
    @Field
    private String desc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
