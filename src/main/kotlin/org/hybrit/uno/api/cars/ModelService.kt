package org.hybrit.uno.api.cars

import org.springframework.beans.factory.annotation.Qualifier
//import org.springframework.data.elasticsearch.client.reactive.ReactiveElasticsearchClient
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.toFlux

@Service
class ModelService(

) {

        val models: Set<BrandModel> =
                setOf(
                        BrandModel("1", Brand("1", "Renault"), "Clio", "", "", "compact", "benzine", isElectric = false, isHybrid = true),
                        BrandModel("2", Brand("1", "Renault"), "Zie", "", "", "compact", "", isElectric = true, isHybrid = false),
                        BrandModel("3", Brand("1", "Renault"), "Twingo", "", "", "compact", "benzine", isElectric = false, isHybrid = false),
                        BrandModel("4", Brand("1", "Renault"), "Clio Estate", "", "", "medium", "diesel", isElectric = false, isHybrid = true),
                        BrandModel("5", Brand("1", "Renault"), "Kadjar", "", "", "suv", "diesel", isElectric = false, isHybrid = false),
                        BrandModel("5", Brand("1", "Renault"), "Capture", "", "", "suv", "benzine", isElectric = false, isHybrid = false)
                )

        fun getAllSortedByEfficiency(): Flux<BrandModel> =
                models.stream()
                        .sorted { brandModel, brandModel2 -> brandModel.efficiencyScore().compareTo(brandModel2.efficiencyScore()) }
                        .toFlux()

}
