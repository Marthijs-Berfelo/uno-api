package org.hybrit.uno.api.cars

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/api/renault")
class ModelController(val service: ModelService) {

    @GetMapping("/most-efficient")
    fun getAllByEfficiency(): Flux<BrandModel> =
            service.getAllSortedByEfficiency()
}
