package hr.brocom.emporium.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Integer executiveNumber;
    @ManyToOne
    private Invoice invoice;
    private Double amount;

}
