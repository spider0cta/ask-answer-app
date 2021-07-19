package dev.muhammad.askanswerapp.repository;

import dev.muhammad.askanswerapp.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
}
