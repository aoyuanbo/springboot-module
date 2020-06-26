package com.bonc.demo.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
/**
 * (Grade)实体类
 *
 * @author aoyuanbo
 * @since 2020-06-25 23:20:54
 */
@Data
public class Grade implements Serializable {
    private static final long serialVersionUID = 530529669015681627L;
    
    private String id;
    
    private String courseid;
    
    private String grade;

}