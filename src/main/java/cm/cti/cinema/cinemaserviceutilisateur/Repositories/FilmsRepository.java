package cm.cti.cinema.cinemaserviceutilisateur.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cm.cti.cinema.cinemaserviceutilisateur.models.Films;


@RepositoryRestResource
public interface FilmsRepository extends JpaRepository<Films, Long>{

}
