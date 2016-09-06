package evil.ducks

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.jupiter.api.Test

class SimpleTest {

    @Test
    fun simple() {
        "string" shouldMatch equalTo("string")
    }
}