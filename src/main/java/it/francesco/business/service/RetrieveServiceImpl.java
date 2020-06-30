package it.francesco.business.service;

import it.francesco.business.mappers.DevMapper;
import it.francesco.dal.dao.DevDao;
import it.francesco.presentation.domain.dto.DevDto;
import it.francesco.presentation.domain.service.IRetrieveService;

import javax.inject.Inject;
import java.util.List;

public class RetrieveServiceImpl implements IRetrieveService {
    @Inject
    DevDao devDao;

    @Inject
    DevMapper devMapper;

    @Override
    public List<DevDto> retrieveAllDevs() {
        return devMapper.toDtos(devDao.getDevs());
    }
}
