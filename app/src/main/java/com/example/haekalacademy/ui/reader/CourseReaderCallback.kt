package com.example.haekalacademy.ui.reader

interface CourseReaderCallback {
    fun moveTo(position: Int, moduleId: String)
}