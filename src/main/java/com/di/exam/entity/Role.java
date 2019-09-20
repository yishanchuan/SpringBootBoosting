package com.di.protal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "t_role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    public Integer id;
    private String name;
    @ManyToOne(targetEntity = User.class)
    private User user;
    private List<String> power;

    public Role() {
    }

    public Role(Integer id, String name, User user) {
        this.id = id;
        this.name = name;
        this.user = user;
    }

    public Role(Integer id, String name, User user, List<String> power) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.power = power;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getPower() {
        return power;
    }

    public void setPower(List<String> power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user=" + user +
                ", power=" + power +
                '}';
    }
}
