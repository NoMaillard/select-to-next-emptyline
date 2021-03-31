package com.github.nomaillard.selecttonextemptyline.services

import com.github.nomaillard.selecttonextemptyline.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
