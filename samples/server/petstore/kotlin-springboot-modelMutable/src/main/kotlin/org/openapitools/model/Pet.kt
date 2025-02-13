package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Category
import org.openapitools.model.Tag
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.annotations.ApiModelProperty

/**
 * A pet for sale in the pet store
 * @param name 
 * @param photoUrls 
 * @param id 
 * @param category 
 * @param tags 
 * @param status pet status in the store
 */
data class Pet(

    @ApiModelProperty(example = "doggie", required = true, value = "")
    @field:JsonProperty("name", required = true) var name: kotlin.String,

    @ApiModelProperty(example = "null", required = true, value = "")
    @field:JsonProperty("photoUrls", required = true) var photoUrls: kotlin.collections.MutableList<kotlin.String>,

    @ApiModelProperty(example = "null", value = "")
    @field:JsonProperty("id") var id: kotlin.Long? = null,

    @field:Valid
    @ApiModelProperty(example = "null", value = "")
    @field:JsonProperty("category") var category: Category? = null,

    @field:Valid
    @ApiModelProperty(example = "null", value = "")
    @field:JsonProperty("tags") var tags: kotlin.collections.MutableList<Tag>? = null,

    @ApiModelProperty(example = "null", value = "pet status in the store")
    @field:JsonProperty("status") var status: Pet.Status? = null
) {

    /**
    * pet status in the store
    * Values: available,pending,sold
    */
    enum class Status(val value: kotlin.String) {
    
        @JsonProperty("available") available("available"),
    
        @JsonProperty("pending") pending("pending"),
    
        @JsonProperty("sold") sold("sold");
    
    }

}

