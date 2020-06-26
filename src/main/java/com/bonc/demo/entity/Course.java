package com.bonc.demo.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
/**
 * (Course)实体类
 *
 * @author aoyuanbo
 * @since 2020-06-25 23:05:30
 */
@Data
public class Course implements Serializable {
    private static final long serialVersionUID = 460355455949917791L;
    
    private String id;
    
    private String course;
    
    private String score;
    
    private String userid;

    private List<Grade> gradeList;
}