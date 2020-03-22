package com.example.noteskeeper

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes=ArrayList<NoteInfo>()

    init{
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents","programming with android intents")
        courses.set(course.courseId, course)

        course = CourseInfo("course 1","title 1")
        courses.set(course.courseId, course)

        course = CourseInfo("course 2","title 2")
        courses.set(course.courseId, course)

        course = CourseInfo("course 3","title 3")
        courses.set(course.courseId, course)


    }
}