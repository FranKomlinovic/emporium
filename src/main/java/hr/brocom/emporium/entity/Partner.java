package hr.brocom.emporium.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String oib;
    private String name;
    @ManyToMany
    private Set<Contact> contacts;
    @ManyToMany
    private Set<Address> addresses;


}