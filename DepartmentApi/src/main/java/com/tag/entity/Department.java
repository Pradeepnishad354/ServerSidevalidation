package com.tag.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Department {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)


    private Long departmentId;

@NotEmpty
@Column(name="dpname",nullable=false)
@Size(min=10,message="department name should have at least 10 character ")
    private String departmentName;

    @NotEmpty
    @Size(min=8,message="department should have at least 8 character ")
    private String departmentAddress;
    
    @Size(min=4,message="department code should have at least 4 character")
    private String departmentCode;



}
