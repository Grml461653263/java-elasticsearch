package com.my.pojo;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
@Data

@Document(indexName = "testindex",type = "like", shards = 1,replicas = 0, refreshInterval = "-1")
public class Like {

    @Id
    private Integer id;
    @Field(type = FieldType.Date,index = false)
    private int likeTime;
    @Field(type = FieldType.Auto,index = true,analyzer = "ik_max_word")
    private String becauseOf;
    @Field(type = FieldType.Auto,index = true)
    private String want;

    public int getLikeTime() {
        return likeTime;
    }

    public void setLikeTime(int likeTime) {
        this.likeTime = likeTime;
    }

    public String getBecauseOf() {
        return becauseOf;
    }

    public void setBecauseOf(String becauseOf) {
        this.becauseOf = becauseOf;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
