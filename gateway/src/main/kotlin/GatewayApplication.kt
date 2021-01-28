package me.sean.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

/**
 * 网关服务入口
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
open class GatewayApplication

fun main(args: Array<String>) {
    runApplication<GatewayApplication>(*args)
}