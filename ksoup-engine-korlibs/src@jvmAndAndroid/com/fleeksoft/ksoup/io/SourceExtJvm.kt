package com.fleeksoft.ksoup.io

import korlibs.io.file.std.toVfs
import java.io.File
import java.io.InputStream

fun FileSource.Companion.from(file: File): FileSource  = FileSource.from(file.toVfs())
fun SourceReader.Companion.from(inputStream: InputStream): SourceReader  = SourceReader.from(inputStream.readAllBytes())