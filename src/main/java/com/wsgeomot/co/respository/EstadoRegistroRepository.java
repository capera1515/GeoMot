/**
 * 
 */
package com.wsgeomot.co.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wsgeomot.co.model.entity.EstadoRegistroEntity;

/**
 * @author Andres Capera
 *
 */
@Repository
public interface EstadoRegistroRepository extends JpaRepository<EstadoRegistroEntity, Integer> {

}
