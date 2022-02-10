package com.github.jb5982857.intellijplatformplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.jb5982857.intellijplatformplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
