@file:Suppress("unused")

package org.indx.fractions

class FractionOperations {

    private fun lcm(num1: Int, num2: Int): Int {
        var lcm: Int = if (num1 > num2) num1 else num2
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                return lcm
            }

            lcm++
        }
    }


    /**
     * Fraction addition function.
     */
    fun fractionAddition(fraction1: Fraction, fraction2: Fraction): Fraction {
        val denominatorLcm: Int = lcm(fraction1.denominator, fraction2.denominator)
        println(denominatorLcm)

        val fraction1Multiplier = denominatorLcm / fraction1.denominator
        val fraction2Multiplier = denominatorLcm / fraction2.denominator
        println(fraction1Multiplier)
        println(fraction2Multiplier)

        fraction1.numerator *= fraction1Multiplier
        fraction1.denominator *= fraction1Multiplier
        fraction2.numerator *= fraction2Multiplier
        fraction2.denominator *= fraction2Multiplier

        return Fraction(fraction1.numerator + fraction2.numerator, fraction1.denominator)

    }

    /**
     * Fraction subtraction function.
     */
    fun fractionSubtraction(fraction1: Fraction, fraction2: Fraction): Fraction {
        val denominatorLcm: Int = lcm(fraction1.denominator, fraction2.denominator)
        println(denominatorLcm)

        val fraction1Multiplier = denominatorLcm / fraction1.denominator
        val fraction2Multiplier = denominatorLcm / fraction2.denominator
        println(fraction1Multiplier)
        println(fraction2Multiplier)

        fraction1.numerator *= fraction1Multiplier
        fraction1.denominator *= fraction1Multiplier
        fraction2.numerator *= fraction2Multiplier
        fraction2.denominator *= fraction2Multiplier

        return Fraction(fraction1.numerator - fraction2.numerator, fraction1.denominator)

    }

    /**
     * Fraction multiplication function.
     */
    fun fractionMultiplication(fraction1: Fraction, fraction2: Fraction): Fraction {
        val denominatorLcm: Int = lcm(fraction1.denominator, fraction2.denominator)
        println(denominatorLcm)

        val fraction1Multiplier = denominatorLcm / fraction1.denominator
        val fraction2Multiplier = denominatorLcm / fraction2.denominator
        println(fraction1Multiplier)
        println(fraction2Multiplier)

        fraction1.numerator *= fraction1Multiplier
        fraction1.denominator *= fraction1Multiplier
        fraction2.numerator *= fraction2Multiplier
        fraction2.denominator *= fraction2Multiplier

        return Fraction(fraction1.numerator * fraction2.numerator, fraction1.denominator * fraction2.denominator)

    }

    /**
     * Fraction division function.
     */
    fun fractionDivision(fraction1: Fraction, fraction2: Fraction): Fraction {
        val denominatorLcm: Int = lcm(fraction1.denominator, fraction2.denominator)
        println(denominatorLcm)

        val fraction1Multiplier = denominatorLcm / fraction1.denominator
        val fraction2Multiplier = denominatorLcm / fraction2.denominator
        println(fraction1Multiplier)
        println(fraction2Multiplier)

        fraction1.numerator *= fraction1Multiplier
        fraction1.denominator *= fraction1Multiplier
        fraction2.numerator *= fraction2Multiplier
        fraction2.denominator *= fraction2Multiplier

        return Fraction(fraction1.numerator * fraction2.denominator, fraction1.denominator * fraction2.numerator)

    }

    /**
     * Function for converting fraction to double.
     */
    fun toDouble(fraction: Fraction): Double {
        return((fraction.numerator / fraction.denominator).toDouble())
    }

    /**
     * Function for converting fraction to float.
     */
    fun toFloat(fraction: Fraction): Float {
        return((fraction.numerator / fraction.denominator).toFloat())
    }

}