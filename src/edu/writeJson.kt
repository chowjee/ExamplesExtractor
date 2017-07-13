package edu

import com.fasterxml.jackson.databind.ObjectMapper
import java.io.File

fun writeJson(course: Course, jsonFile: File) {
  val mapper = ObjectMapper()
  mapper.writerWithDefaultPrettyPrinter().writeValue(jsonFile, course)
}