package demo.testexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.testexample.model.EmpModel;
import demo.testexample.repository.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	EmpRepository empRepository;

	public List<EmpModel> getAllEmployee() {
		List<EmpModel> findAll = (List<EmpModel>) empRepository.findAll();
		return findAll;
	}

	public void postEmp(EmpModel e) {
		empRepository.save(e);
		
	}

	public void deleteemp(Integer id) {
		empRepository.deleteById(id);
		
	}

	public void updateemp(Integer id,EmpModel e) {
		Optional<EmpModel> findById = empRepository.findById(id);
		EmpModel empModel = findById.get();
		empModel.setId(e.getId());
		empModel.setEname(e.getEname());
		empModel.setAddress(e.getAddress());
		
		empRepository.save(empModel);
		
	}

}
