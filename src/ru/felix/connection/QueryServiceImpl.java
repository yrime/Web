package ru.felix.connection;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.felix.teatre.Place;

@Repository
@Transactional
public class QueryServiceImpl implements QueryService {

	private QueryRepository queryRepo;
	
	@Transactional(propagation= Propagation.NEVER)
	public List<Place> getAllPlace() {
		// TODO Auto-generated method stub
		return queryRepo.getAllPlace();
	}

	public void setQueryRepository(QueryRepository queryR) {
		this.queryRepo = queryR;
	}
}
