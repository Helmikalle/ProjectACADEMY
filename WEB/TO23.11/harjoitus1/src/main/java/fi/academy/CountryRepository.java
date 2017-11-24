package fi.academy;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountryRepository extends CrudRepository<Country, String> {
    @Query("SELECT c FROM Country c ORDER BY c.name")
    List<Country> etsiMaaNimella(@Param("name") String name);

}
