package org.nav.solution.dao;

import org.nav.solution.model.Register;

import java.util.List;

public interface RegisterDao {
void insert(Register register);
List<Register> getAllRegister();
void delete(Register register);

 Register getRegisterById(int registerId);

//    void updateRegsietr(Register register);
}
