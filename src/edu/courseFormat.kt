package edu

data class Course(
        val lessons: List<Lesson>,
        val summary: String,
        val title: String,
        val programming_language: String)

data class Lesson(val id: Int, val title: String, val task_list: List<Task>)

data class Task(
        val name: String,
        val stepic_id: Int,
        val task_files: Map<String, TaskFile>,
        val test_files: Map<String, String>,
        val task_texts: Map<String, String>,
        val task_type: String = "pycharm")

data class TaskFile(
    val name: String,
    val text: String,
    val placeholders: List<Placeholder>
)

data class Placeholder(
    val offset: Int,
    val length: Int,
    val subtask_infos: Map<String, SubTaskInfo>
)

data class SubTaskInfo(
    val hints: List<String>,
    val possibleAnswer: String,
    val placeholder_text: String,
    val has_frame: Boolean = true,
    val need_insert_text: Boolean = false
)
