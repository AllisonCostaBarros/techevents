package br.com.allidev.techevents.domain.event;

import br.com.allidev.techevents.domain.address.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "event")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Id
    @GeneratedValue
    private UUID id;
    private String title;
    private String description;
    private Date date;
    private String imgUrl;
    private String eventUrl;
    private boolean remote;

    @OneToOne(mappedBy = "event", cascade = CascadeType.ALL)
    private Address address;
}