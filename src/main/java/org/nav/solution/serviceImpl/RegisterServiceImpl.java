package org.nav.solution.serviceImpl;


import org.nav.solution.dao.RegisterDao;
import org.nav.solution.model.Register;
import org.nav.solution.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterDao registerDao;
    public void insert(Register register) {
   registerDao.insert(register);
    }
public List<Register> listAllRegister(){
        return registerDao.getAllRegister();

}

    public Register getRegisterById(int registerid) {
        return registerDao.getRegisterById(registerid);
    }

    public void delete(Register register){
   registerDao.delete(register);

    }
}


