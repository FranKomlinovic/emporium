package hr.brocom.emporium.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private ContactType contactType;
    private String contact;
}
