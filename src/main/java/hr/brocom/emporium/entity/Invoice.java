package hr.brocom.emporium.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date creationDate;
    private Date deliveryDate;
    private Date dueDate;
    @ManyToOne
    private BusinessYear businessYear;
    @ManyToOne
    private Office office;
    @ManyToOne
    private Operator operator;
    private Integer invoiceNumber;
    @ManyToOne
    private PaymentType paymentType;
    @ManyToOne
    private Partner partner;
    private String remark;
    @OneToMany
    private List<Payment> payments;
}
