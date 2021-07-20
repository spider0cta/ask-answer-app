package dev.muhammad.askanswerapp.repository;

import dev.muhammad.askanswerapp.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote,Long> {

}
