package io.androidedu.hoop.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import io.androidedu.hoop.dao.CallDao
import io.androidedu.hoop.dao.ChatDao
import io.androidedu.hoop.dao.StatusDao
import io.androidedu.hoop.entity.CallEntity
import io.androidedu.hoop.entity.ChatEntity
import io.androidedu.hoop.entity.StatusEntity


@Database(entities = [ChatEntity::class, StatusEntity::class, CallEntity::class], version = 1)
abstract class HoopDB : RoomDatabase() {

    abstract fun getChatDao(): ChatDao
    abstract fun getStatusDao(): StatusDao
    abstract fun getCallDao(): CallDao

    companion object {

        private var INSTANCE: HoopDB? = null

        fun getInstance(context: Context): HoopDB? {
            if (INSTANCE == null) {
                synchronized(HoopDB::class)
                {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        HoopDB::class.java,
                        "hoop_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE
        }

    }


}