package com.grizzly.pojo;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "admin")
public class Admin implements Serializable {

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private Integer aid;
    @Column(name = "aname", unique = true, nullable = false, length = 64)
    private String aname;
    @Column(name = "apassword", nullable = false, length = 64)
    private String apassword;
}
