package com.devsuperior.bds04.services;

import com.devsuperior.bds04.dto.EventDTO;
import com.devsuperior.bds04.entities.City;
import com.devsuperior.bds04.entities.Event;
import com.devsuperior.bds04.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EventService {

    @Autowired
    private EventRepository repository;

    @Transactional
    public EventDTO insert(EventDTO dto){
        Event entity = new Event();
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new EventDTO(entity);
    }

    @Transactional(readOnly = true)
    public Page<EventDTO> findAll(Pageable pageable){
        Page<Event> page = repository.findAll(pageable);
        return page.map(x -> new EventDTO(x));
    }

    private void copyDtoToEntity(EventDTO dto, Event entity){
        entity.setName(dto.getName());
        entity.setUrl(dto.getUrl());
        entity.setDate(dto.getDate());
        entity.setCity(new City(dto.getCityId(), null));
    }
}
