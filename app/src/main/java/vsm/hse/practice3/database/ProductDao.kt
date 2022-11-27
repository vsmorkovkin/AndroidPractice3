package database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {
    @Query("SELECT * FROM product")
    fun getAll() : List<Product>

    @Insert
    fun insert(product: Product)

    @Delete
    fun delete(product: Product)
}