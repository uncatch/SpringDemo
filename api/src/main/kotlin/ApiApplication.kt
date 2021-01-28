package me.sean.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

/**
 * Api服务入口
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
open class ApiApplication

fun main(args: Array<String>){
    runApplication<ApiApplication>(*args)
}