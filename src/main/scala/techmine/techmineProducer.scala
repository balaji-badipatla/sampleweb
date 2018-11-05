package techmine

import org.apache.camel.Exchange
import org.apache.camel.impl.DefaultProducer


/**
 * The techmine producer.
 */
class techmineProducer(endpoint: techmineEndpoint) extends DefaultProducer(endpoint) {

  def process(exchange: Exchange) : Unit = {
    println(exchange.getIn().getBody())
  }

}
