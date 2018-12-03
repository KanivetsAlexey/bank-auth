package com.bank.auth.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "role")
public class Role extends AbstractEntity{

    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
