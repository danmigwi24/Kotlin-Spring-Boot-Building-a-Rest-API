package com.example.springbootplayerstore.models


import jakarta.persistence.*
import org.hibernate.Hibernate

@Entity
@Table(name = "tb_player")
data class Player(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long,
    val name: String,
    val age: Int,
    val nationality: String
) {

}