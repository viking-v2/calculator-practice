package com.sc.marcus.calculator

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import android.text.Editable

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    val calcEngine = CalculatorEngine()

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.sc.marcus.calculator", appContext.packageName)
    }
}
