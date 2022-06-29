package com.github.harishymn.newplugin.services

import com.intellij.openapi.project.Project
import com.github.harishymn.newplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
