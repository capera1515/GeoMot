/**
 * 
 */
package com.wsgeomot.co.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wsgeomot.co.model.entity.MotoEntity;

/**
 * @author Andres Capera
 *
 */
@Repository
public interface MotoRepository extends JpaRepository<MotoEntity, Integer> {

	@Query(value = "SELECT * FROM moto_preuba MP WHERE MP.MOT_PLACA = :PLACA", nativeQuery = true)
	MotoEntity findMotoPlacaParamsNative(@Param("PLACA") String placa);

}
