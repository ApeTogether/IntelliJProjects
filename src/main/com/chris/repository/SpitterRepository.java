package main.com.chris.repository;

import main.com.chris.entity.Spitter;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther Chris Lee
 * @Date 7/25/2018 17:20
 * @Description
 */
public interface SpitterRepository extends JpaRepository<Spitter, Long> {
	Spitter findSpitterById(String id);
}
