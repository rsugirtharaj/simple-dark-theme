package com.github.rsugirtharaj.simpledarktheme.services

import com.intellij.openapi.project.Project
import com.github.rsugirtharaj.simpledarktheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
