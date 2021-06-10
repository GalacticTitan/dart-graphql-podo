package com.github.kiranbjm.dartgraphqlpodo.services

import com.github.kiranbjm.dartgraphqlpodo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
