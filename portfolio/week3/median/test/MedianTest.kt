// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Median with 1"{
        median(listOf(5.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }

    "Median with 2" {
        median(listOf(5.0f, 3.0f)) shouldBe (4.0f plusOrMinus tolerance)
    }

    "Median with 3" {
        median(listOf(5.0f, 3.0f, 4.0f)) shouldBe (4.0f plusOrMinus tolerance)
    }

    "Median with unsorted" {
        median(listOf(5.0f, 3.0f, 4.0f, 6.0f)) shouldBe (4.5f plusOrMinus tolerance)
    }
})
