package br.com.allidev.techevents.domain.address;

import br.com.allidev.techevents.domain.event.Event;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Table(name = "address")
@Entity
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue
    private UUID id;
    private String city;
    private String uf;

    @OneToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
