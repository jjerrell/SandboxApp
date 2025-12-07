package dev.jjerrell.sandbox.client.storage.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SandboxEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val content: String
)