/**
 * 
 */
package com.wsgeomot.co.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wsgeomot.co.model.entity.NotificacionEntity;

/**
 * @author Andres Capera
 *
 */
@Repository
public interface NotificacionRepository extends JpaRepository<NotificacionEntity, Integer> {

}
