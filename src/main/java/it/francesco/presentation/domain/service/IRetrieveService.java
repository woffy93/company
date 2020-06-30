package it.francesco.presentation.domain.service;

import it.francesco.presentation.domain.dto.DevDto;

import java.util.List;

public interface IRetrieveService {
    public List<DevDto> retrieveAllDevs();
}
