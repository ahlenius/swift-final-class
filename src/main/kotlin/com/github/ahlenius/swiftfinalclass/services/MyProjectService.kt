package com.github.ahlenius.swiftfinalclass.services

import com.intellij.openapi.project.Project
import com.github.ahlenius.swiftfinalclass.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
