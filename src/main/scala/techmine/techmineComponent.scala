package techmine


import org.apache.camel.Endpoint
import org.apache.camel.impl.DefaultComponent
import java.util.Map

/**
 * Represents the component that manages {@link techmineEndpoint}.
 */
class techmineComponent extends DefaultComponent {

  protected def createEndpoint(uri: String, remaining: String, parameters: Map[String, Object]): Endpoint = {

    val endpoint = new techmineEndpoint(uri, this)
    setProperties(endpoint, parameters)

    endpoint
  }
}
