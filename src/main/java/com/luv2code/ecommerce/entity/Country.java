package com.luv2code.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    @OneToMany(mappedBy = "country")
    @JsonIgnore
    private List<State> states;

}
