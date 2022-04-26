/**
 * 
 */
package com.wsgeomot.co.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wsgeomot.co.model.entity.ContactoEntity;

/**
 * @author Andres Capera
 *
 */
@Repository
public interface ContactoRepository extends JpaRepository<ContactoEntity, Integer>  {
	@Query(value = "SELECT * FROM contacto MP WHERE MP.IdPersona = :IDPERS AND MP.Tipocontacto = :TIPOCOT", nativeQuery = true)
	ContactoEntity findPersonaParamsNative(@Param("IDPERS") String idPersona, @Param("TIPOCOT") String tipocontacto);
}
