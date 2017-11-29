package fi.academy;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SanontaRepository extends CrudRepository <Sanonta,Integer> {

    @Query("SELECT u FROM Sanonta u WHERE u.id =:id")
    List<Sanonta> haeSanontaIdlla(@Param("id") Integer id);
}
