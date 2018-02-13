package ru.felix.connection;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ru.felix.teatre.Place;
import ru.felix.teatre.Teatre;

interface QueryRepository extends CrudRepository<Place, Long>{
	@Query("select * from salle")
    List<Place> getAllPlace();
}
