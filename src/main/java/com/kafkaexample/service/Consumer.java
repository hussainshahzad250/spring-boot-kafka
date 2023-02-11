package com.kafkaexample.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public final class Consumer {

	@KafkaListener(topics = "kafka_topic_name") // This is kafka topic
	public void consume(String message) {
		log.info("Received Messasge => {}", message);
	}
}