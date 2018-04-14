package com.malinskiy.marathon.execution.strategy.impl

import com.malinskiy.marathon.device.DevicePool
import com.malinskiy.marathon.execution.ExecutionShard
import com.malinskiy.marathon.execution.strategy.ShardingStrategy
import com.malinskiy.marathon.test.Test

/**
 * Implements default sharding which executes all tests in parallel on all available devices in the pool
 */
class ParallelShardingStrategy : ShardingStrategy {
    override fun createShards(tests: Collection<Test>, pools: Collection<DevicePool>): Collection<ExecutionShard> {
        return pools.map {
            ExecutionShard(it, tests)
        }
    }
}