package com.example.haekalacademy.di

import android.content.Context
import com.example.haekalacademy.data.AcademyRepository
import com.example.haekalacademy.data.source.local.LocalDataSource
import com.example.haekalacademy.data.source.local.room.AcademyDatabase
import com.example.haekalacademy.data.source.remote.RemoteDataSource
import com.example.haekalacademy.utils.AppExecutors
import com.example.haekalacademy.utils.JsonHelper

object Injection {

    fun provideRespository(context: Context): AcademyRepository {

        val database = AcademyDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.academyDao())
        val appExecutors = AppExecutors()

        return AcademyRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}