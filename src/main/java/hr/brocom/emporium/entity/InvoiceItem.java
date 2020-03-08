package hr.brocom.emporium.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class InvoiceItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Invoice invoice;
    private Product product;
    private Double quantity;
    private QuantityType quantityType;
    private Double price;
    private Double discount;
    private Double vat;

}
