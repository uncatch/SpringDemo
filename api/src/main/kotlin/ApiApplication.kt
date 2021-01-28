package me.sean.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Api服务入口
 */
@SpringBootApplication
open class ApiApplication

fun main(args: Array<String>){
    runApplication<ApiApplication>(*args)
}