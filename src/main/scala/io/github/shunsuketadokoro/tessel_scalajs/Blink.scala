package io.github.shunsuketadokoro.tessel_scalajs

import scala.scalajs.js
import scala.scalajs.js.JSApp
import scala.scalajs.js.Dynamic.{ global => g }

object Blink extends JSApp {

  def main(): Unit = {

    // Import the interface to Tessel hardware
    val tessel = g.require("tessel")

    // Turn one of the LEDs on to start.
    tessel.led(2).on()

    // Blink!
    js.timers.setInterval(100) {
      tessel.led(2).toggle()
      tessel.led(3).toggle()
    }
  }

  println("I'm blinking! (Press CTRL + C to stop)")

}
