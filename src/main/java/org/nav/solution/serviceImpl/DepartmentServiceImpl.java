package org.nav.solution.serviceImpl;

import org.nav.solution.dao.DepartmentDao;
import org.nav.solution.model.Department;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentDao {

    public void insert(Department department) {
  //
        //      DepartmentDao.insert(department);
    }
}
