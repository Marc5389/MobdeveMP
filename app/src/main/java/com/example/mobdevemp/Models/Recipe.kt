package com.example.mobdevemp.Models

class Recipe {
    var vegetarian: Boolean = false
    var vegan: Boolean = false
    var glutenFree: Boolean = false
    var dairyFree: Boolean = false
    var veryHealthy: Boolean = false
    var cheap: Boolean = false
    var veryPopular: Boolean = false
    var sustainable: Boolean = false
    var weightWatcherSmartPoints: Int = 0
    var gaps: String = ""
    var lowFodnap: Boolean = false
    var aggregateLikes: Int = 0
    var healthScore: Double = 0.0
    var creditsText: String = ""
    var license: String = ""
    var sourceName: String = ""
    var pricePerServing: Double = 0.0
    var extendedIngredients: ArrayList<ExtendedIngredient> = ArrayList()
    var id: Int = 0
    var title: String = ""
    var readyInMinutes: Int = 0
    var servings: Int = 0
    var sourceUrl: String = ""
    var image: String = ""
    var imageType: String = ""
    var summary: String = ""
    var cuisines: ArrayList<Any> = ArrayList()
    var dishTypes: ArrayList<String> = ArrayList()
    var diets: ArrayList<String> = ArrayList()
    var occasions: ArrayList<String> = ArrayList()
    var instructions: String = ""
    var analyzedInstructions: ArrayList<AnalyzedInstructions> = ArrayList()
    var originalId: Any? = null
    var spoonacularSourceUrl: String = ""
}
