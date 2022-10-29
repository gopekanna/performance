
import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation

import scala.concurrent.duration.DurationInt


class perform extends Simulation{


  val getTest = scenario("get the test feature file").exec(karateFeature("classpath:search.feature"))

  setUp(
  getTest.inject(atOnceUsers(5))
  //getTest.inject(rampUsers(100).during(10.seconds))
  )
}
