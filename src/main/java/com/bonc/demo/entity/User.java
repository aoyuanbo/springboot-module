package com.bonc.demo.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
/**
 * (User)实体类
 *
 * @author aoyuanbo
 * @since 2020-06-25 23:04:33
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -86805380714661776L;
    
    private String id;
    
    private String name;
    
    private String age;

    private List<Course> courseList;

}