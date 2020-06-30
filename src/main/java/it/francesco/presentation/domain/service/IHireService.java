package it.francesco.presentation.domain.service;

import it.francesco.presentation.domain.dto.CeoDto;
import it.francesco.presentation.domain.dto.DevDto;
import it.francesco.presentation.domain.dto.PMDto;

public interface IHireService {
    public void hire(CeoDto ceo, PMDto projectManager);
    public void hire(CeoDto ceo, DevDto dev);
}
