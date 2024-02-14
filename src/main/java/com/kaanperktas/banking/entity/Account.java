package com.kaanperktas.banking.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
@Entity
public class  Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "account_holder_name")
    private String accountHolderName;
    private double balance;



    int num = 10;
    String result = (num > 0) ? "Pozitif" : (num < 0) ? "Negatif" : "Sıfır";

     // Ekrana "Pozitif" yazdırır


}
