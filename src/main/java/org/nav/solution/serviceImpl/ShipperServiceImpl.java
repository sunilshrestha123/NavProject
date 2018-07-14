package org.nav.solution.serviceImpl;

import org.nav.solution.dao.ShipperDao;
import org.nav.solution.model.Shipper;
import org.nav.solution.service.ShipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ShipperServiceImpl implements ShipperService {

    @Autowired
    private ShipperDao shipperDao;
    public void insert(Shipper shipper) {
        shipperDao.insert(shipper);
    }
}
