package com.example.data2.mapper

import com.example.data2.response.ListLineBusResponse
import com.example.domain.response.LineBus

class BusLineMapper : BaseMapper<ListLineBusResponse, LineBus> {
    override fun transform(type: ListLineBusResponse): LineBus = type.run {
        LineBus(
            id,
            base,
            linea
        )
    }

    fun transformListOfBuses(busResponse: List<ListLineBusResponse>) =
        busResponse.map { transform(it) }
}
