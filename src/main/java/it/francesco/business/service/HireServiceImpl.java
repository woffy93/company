package it.francesco.business.service;

import it.francesco.dal.dao.CeoDao;
import it.francesco.dal.dao.DevDao;
import it.francesco.dal.dao.PMDao;
import it.francesco.dal.entity.Dev;
import it.francesco.dal.entity.PM;
import it.francesco.presentation.domain.dto.CeoDto;
import it.francesco.presentation.domain.dto.DevDto;
import it.francesco.presentation.domain.dto.PMDto;
import it.francesco.presentation.domain.service.IHireService;

import javax.inject.Inject;

public class HireServiceImpl implements IHireService {
    @Inject
    CeoDao ceoDao;
    @Inject
    PMDao pmDao;
    @Inject
    DevDao devDao;

    @Override
    public void hire(CeoDto ceo, PMDto projectManager) {
        if (ceoDao.isCeoValid(ceo.getCf())) {
            PM pm = new PM();
            pm.setCf(projectManager.getCf());
            pmDao.persist(pm);
        }
    }

    @Override
    public void hire(CeoDto ceo, DevDto developer) {
        if (ceoDao.isCeoValid(ceo.getCf())) {
            Dev dev = new Dev();
            dev.setCf(developer.getCf());
            devDao.persist(dev);
        }
    }
}
