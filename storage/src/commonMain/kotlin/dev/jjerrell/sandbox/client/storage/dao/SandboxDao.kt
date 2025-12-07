package dev.jjerrell.sandbox.client.storage.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import dev.jjerrell.sandbox.client.storage.entity.SandboxEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SandboxDao {
    @Insert
    suspend fun insert(item: SandboxEntity)

    @Query("SELECT count(*) FROM SandboxEntity")
    suspend fun count(): Int

    @Query("SELECT * FROM SandboxEntity")
    fun getAllAsFlow(): Flow<List<SandboxEntity>>
}