package com.xsis.bootcamp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;


@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "deptid_pk")
    @SequenceGenerator(name = "deptid_pk", sequenceName = "departments_department_id_seq", allocationSize = 3)
    @Column(name="department_id")
    private Long departmentId;

    @Column(name="department_name")
    @Size(min=3, max=30)
    @NotBlank(message="deparment name required")
    private String departmentName;

    @Column(name="location_id")
    private Long locationId;

    public Department(){}

    

    public Department(String departmentName, Long locationId) {
        this.departmentName = departmentName;
        this.locationId = locationId;
    }

    
    

    /**
     * @return Long return the departmentId
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * @param departmentId the departmentId to set
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * @return String return the departmentName
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * @param departmentName the departmentName to set
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * @return Long return the locationId
     */
    public Long getLocationId() {
        return locationId;
    }

    /**
     * @param locationId the locationId to set
     */
    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

}