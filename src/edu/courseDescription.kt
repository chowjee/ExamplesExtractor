package edu

import atomInfo.AtomInfo

fun examplesTask(atomInfo: AtomInfo) = """
        Examples accompanying the atom "${atomInfo.title}".

        Mark as `completed` after reading the atom.""".trimIndent()
