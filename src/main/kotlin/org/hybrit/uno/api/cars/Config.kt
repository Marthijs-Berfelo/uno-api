package org.hybrit.uno.api.cars

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
//import org.springframework.data.elasticsearch.client.ClientConfiguration
//import org.springframework.data.elasticsearch.client.reactive.ReactiveElasticsearchClient
//import org.springframework.data.elasticsearch.client.reactive.ReactiveRestClients
import org.springframework.web.reactive.function.client.ExchangeStrategies
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class Config {

//    @Bean("es")
//    fun createClient(): ReactiveElasticsearchClient =
//            WebClient.create()
//                    .mutate()
//                    .exchangeStrategies(
//                            ExchangeStrategies
//                                    .builder()
//                                    .codecs { it.defaultCodecs().maxInMemorySize(-1) }
//                                    .build()
//                    )
//                    .build()
//                    .let {
//                        ClientConfiguration
//                                .builder()
//                                .connectedTo("34.90.224.43:9200", "34.90.224.43:9300")
//                                .withWebClientConfigurer { it }
//                                .build()
//                    }
//                    .let { ReactiveRestClients.create(it) }


}
