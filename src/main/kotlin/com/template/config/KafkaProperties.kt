package com.template.config

import org.springframework.context.annotation.Configuration

@Configuration
class KafkaProperties {

    private val bootStrapServer = "localhost:8082"
    private val producer = mutableMapOf<String, String>()

    fun getProducerProps(): Map<String, Any> {
        val properties = this.producer
        properties.putIfAbsent("bootstrap.servers", this.bootStrapServer)
        return properties
    }
}