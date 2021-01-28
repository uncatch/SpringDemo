package me.sean.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * 网关服务入口
 */
@SpringBootApplication
open class GatewayApplication

fun main(args :Array<String>){
    runApplication<GatewayApplication>(*args)
}