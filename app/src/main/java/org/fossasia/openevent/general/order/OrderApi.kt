package org.fossasia.openevent.general.order

import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface OrderApi {

    @POST("orders?include=event,attendees&fields[event]=id&fields[attendees]=id")
    fun placeOrder(@Body order: Order): Single<Order>

    @POST("orders/{orderIdentifier}/charge")
    fun chargeOrder(@Path("orderIdentifier") orderIdentifier: String, @Body charge: Charge): Single<Charge>


    @GET("/v1/users/40/orders?filter=[{\"name\":\"payment-mode\",\"op\":\"eq\",\"val\":\"free\"}]&include=event,attendees&fields[event]=id&fields[attendees]=id")
    fun ordersUnderUser(): Single<List<OrderUnderUser>>

}