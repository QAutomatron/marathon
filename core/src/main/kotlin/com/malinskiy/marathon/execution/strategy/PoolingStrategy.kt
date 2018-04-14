package com.malinskiy.marathon.execution.strategy

import com.malinskiy.marathon.device.DeviceProvider
import com.malinskiy.marathon.device.DevicePool

interface PoolingStrategy {

    fun createPools(deviceProvider: DeviceProvider): Collection<DevicePool>
}