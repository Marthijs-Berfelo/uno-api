package org.hybrit.uno.api.cars

data class Brand(
        val id: String,
        val name: String
)

class BrandModel(
        val id: String,
        val brand: Brand,
        val name: String,
        val imageUrl: String,
        val price: String,
        val bodyType: String,
        val fuelType: String,
        val isElectric: Boolean,
        val isHybrid: Boolean
) {
        fun efficiencyScore(): Int =
                if (isElectric) {
                        1
                } else if (isHybrid) {
                        if (fuelType == "benzine") {
                                2
                        } else {
                                3
                        }
                } else if (fuelType == "benzine") {
                        4
                } else {
                        5
                }
}
