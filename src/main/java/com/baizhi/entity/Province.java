package com.baizhi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName(value = "t_province")//指定表名
public class Province implements Serializable {
    //value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private Integer id;
    private String province;
    private String tag;
    private Integer spot_number;

    public Province(Integer id, String province, String tag, Integer spot_number) {
        this.id = id;
        this.province = province;
        this.tag = tag;
        this.spot_number = spot_number;
    }

    public Province() {
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", tag='" + tag + '\'' +
                ", spot_number=" + spot_number +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getSpot_number() {
        return spot_number;
    }

    public void setSpot_number(Integer spot_number) {
        this.spot_number = spot_number;
    }

}

