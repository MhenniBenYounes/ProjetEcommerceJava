package fr.idprocess.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.idprocess.admin.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	Admin findByUsername(String username);
}
