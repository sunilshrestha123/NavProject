package org.nav.solution.service;

import jdk.internal.dynalink.linker.LinkerServices;
import org.nav.solution.model.Register;

import java.util.List;

public interface RegisterService {
    void insert(Register register);
List<Register>listAllRegister();
Register getRegisterById(int registerId);
void delete(Register register);
//void update(Register register);
}
