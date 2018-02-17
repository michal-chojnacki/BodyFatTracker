package com.github.chojmi.bodyfattracker

import com.github.chojmi.bodyfattracker.Constans.Companion.ABDOMEN_JPG_URL
import com.github.chojmi.bodyfattracker.Constans.Companion.CHEST_JPG_URL
import com.github.chojmi.bodyfattracker.Constans.Companion.THIGH_JPG_URL

data class MeasurementsJP3(val time: Long,
                           val results: Map<MeasurementsSite, MeasurementResult>) {
    val measurementsMethod: MeasurementsMethod = MeasurementsMethod.JACKSON_POLLOCK_3
}

data class MeasurementResult(val measurementsSite: MeasurementsSite, val size: Double)

enum class MeasurementsMethod {
    JACKSON_POLLOCK_3
}

enum class MeasurementsSite(val jpgUrl: String) {
    CHEST(CHEST_JPG_URL),
    ABDOMEN(ABDOMEN_JPG_URL),
    THIGH(THIGH_JPG_URL)
}