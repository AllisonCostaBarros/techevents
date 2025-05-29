package br.com.allidev.techevents.domain.address;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "address")
@Entity
public class Address {

    @Id
    @GeneratedValue
    private UUID id;
    private String city;
    private String uf;
}
