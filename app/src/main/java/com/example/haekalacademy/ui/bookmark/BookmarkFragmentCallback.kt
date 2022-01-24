package com.example.haekalacademy.ui.bookmark

import com.example.haekalacademy.data.source.local.entity.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
