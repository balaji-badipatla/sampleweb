package techmine

import org.apache.camel.{Consumer, Processor, Producer}
import org.apache.camel.impl.DefaultEndpoint

/**
 * Represents a techmine endpoint.
 */
class techmineEndpoint(uri:String, component: techmineComponent) extends DefaultEndpoint(uri, component) {

  def createProducer() : Producer = {
    new techmineProducer(this)
  }

  def createConsumer(processor: Processor) : Consumer = {
    new techmineConsumer(this, processor)
  }

  def isSingleton() : Boolean = true

}
