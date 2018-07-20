package org.fossasia.openevent.general.order

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import com.github.jasminb.jsonapi.IntegerIdHandler
import com.github.jasminb.jsonapi.annotations.Id
import com.github.jasminb.jsonapi.annotations.Relationship
import com.github.jasminb.jsonapi.annotations.Type
import org.fossasia.openevent.general.event.Event

@Type("order")
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy::class)
data class OrderUnderUser(
        @Id(IntegerIdHandler::class)
        val id: Long,
        val paymentMode: String? = null,
        val country: String? = null,
        val status: String? = null,
        val amount: Float? = null,
        val orderNotes: String? = null,
        @Relationship("event")
        var event: Event?=null
)