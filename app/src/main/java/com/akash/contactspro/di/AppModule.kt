package com.akash.contactspro.di

import android.content.Context
import androidx.room.Room
import com.akash.contactspro.data.Repository
import com.akash.contactspro.data.local.ContactDao
import com.akash.contactspro.data.local.ContactRoomDatabase
import com.akash.contactspro.util.DATABASE_NAME
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule {

    @JvmStatic
    @Singleton
    @Provides
    fun provideContactDao(contactRoomDatabase: ContactRoomDatabase): ContactDao {
        return contactRoomDatabase.contactDao()
    }

    @JvmStatic
    @Singleton
    @Provides
    fun provideContactDatabase(context: Context): ContactRoomDatabase {
        return Room.databaseBuilder(context, ContactRoomDatabase::class.java, DATABASE_NAME).build()
    }

    @JvmStatic
    @Singleton
    @Provides
    fun provideContactRepository(contactDao: ContactDao): Repository {
        return Repository(contactDao)
    }

}