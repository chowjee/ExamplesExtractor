package edu

data class Course(
        val lessons: List<Lesson>,
        val summary: String,
        val title: String,
        val programming_language: String)

data class Lesson(val id: Int, val title: String, val task_list: List<Task>)

interface Task {
    val name: String
    val stepic_id: Int
    val task_files: Map<String, TaskFile>
    val task_texts: Map<String, String>
    val task_type: String
}

data class GeneralTask(
        override val name: String,
        override val stepic_id: Int,
        override val task_files: Map<String, TaskFile>,
        val test_files: Map<String, String>,
        override val task_texts: Map<String, String>,
        override val task_type: String = "pycharm") : Task

data class TheoryTask(
        override val name: String,
        override val stepic_id: Int,
        override val task_files: Map<String, TaskFile>,
        override val task_texts: Map<String, String>,
        override val task_type: String = "theory") : Task

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
        val possible_answer: String,
        val placeholder_text: String,
        val has_frame: Boolean = true,
        val need_insert_text: Boolean = false
)
