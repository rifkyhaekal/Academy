package com.example.haekalacademy.ui.academy

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.example.haekalacademy.data.AcademyRepository
import com.example.haekalacademy.data.source.local.entity.CourseEntity
import com.example.haekalacademy.vo.Resource

class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    fun getCourses() : LiveData<Resource<PagedList<CourseEntity>>> = academyRepository.getAllCourses()
}