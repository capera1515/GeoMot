/**
 * 
 */
package com.wsgeomot.co.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wsgeomot.co.model.entity.KilometrajenotificacionEntity;

/**
 * @author Andres Capera
 *
 */
@Repository
public interface KilometrajenotificacionRepository  extends JpaRepository<KilometrajenotificacionEntity, Integer>{
 
}
