package hello;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Address {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String street;

    private String city;
    @OneToMany(mappedBy = "address")
    @JsonIgnore
    public List<User> users;


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
