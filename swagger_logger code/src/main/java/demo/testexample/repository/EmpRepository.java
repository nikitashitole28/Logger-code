package demo.testexample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.testexample.model.EmpModel;

@Repository
public interface EmpRepository extends CrudRepository<EmpModel,Integer> {

}
