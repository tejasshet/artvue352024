package com.example.artvue.ecommercearts.model;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private String orderID;

    //customer......
    @OneToOne
    @JoinColumn(name = "customer_name", referencedColumnName = "customer_name")
    private Customer customer;

    //should add mobile no.....

    //address...
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address address;


//    @Column(name = "contact_no")
//    private Long contactNo;
//    should add mobile no in the address table.....

}
