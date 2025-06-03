package br.com.allidev.techevents.service;

import br.com.allidev.techevents.domain.address.Address;
import br.com.allidev.techevents.domain.event.Event;
import br.com.allidev.techevents.domain.event.EventRequestDTO;
import br.com.allidev.techevents.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address createAddress(EventRequestDTO data, Event event) {
        Address address = new Address();
        address.setCity(data.city());
        address.setUf(data.uf());
        address.setEvent(event);

        return addressRepository.save(address);
    }
}
