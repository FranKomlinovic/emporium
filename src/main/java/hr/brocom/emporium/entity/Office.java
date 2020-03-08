package hr.brocom.emporium.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    private Address address;
    private String label;
}
