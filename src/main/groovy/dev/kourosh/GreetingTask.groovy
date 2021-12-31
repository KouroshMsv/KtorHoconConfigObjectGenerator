package dev.kourosh

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.Input

class GreetingTask extends DefaultTask {

    @Input
    String greeting = 'hello from dev.kourosh.GreetingTask'

    @TaskAction
    def greet() {
        println greeting
    }
}