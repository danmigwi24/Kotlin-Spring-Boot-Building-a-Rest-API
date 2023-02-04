package com.example.springbootplayerstore.repositorys

import com.example.springbootplayerstore.models.Player
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * annotate with @Repository and extends
 * JpaRepository by passing the model and the ID data type.
 */
@Repository
interface PlayerRepository : JpaRepository<Player, Long>