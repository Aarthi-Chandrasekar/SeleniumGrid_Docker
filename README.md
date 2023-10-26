# SeleniumGrid_Docker
**Selenium Grid with Docker**

This framework blends the capabilities of Selenium Grid and Docker to simplify the setup and scaling of Selenium Grid. The grid setup involves a central hub and multiple nodes (browser instances) that execute tests based on instructions from the hub.

**Setup Process :**

1. **Download and install Docker from:** https://www.docker.com/products/docker-desktop/. Ensure Docker is active before continuing.
2. **Pull the Selenium Hub Image:** docker pull selenium/hub:3.141.59    
3. **Launch the Selenium Hub Container:** docker run -d -p 4444:4444 --name selenium-hub selenium/hub:3.141.59
4. **Retrieve the Browser Node Images:**

For Chrome: docker pull selenium/node-chrome:3.141.59

For Firefox: docker pull selenium/node-firefox:3.141.59

5. **Launch the Browser Node Containers and connect them to the active Selenium Hub**:

For Chrome:docker run -d --link selenium-hub:hub selenium/node-chrome:3.141.59

For Firefox:docker run -d --link selenium-hub:hub selenium/node-firefox:3.141.59
URL Endpoint: The URL for starting a new session should be http://localhost:4444/wd/hub/session

**Selenium Grid Setup:** Ensure the Selenium Grid Hub is active and properly set up. Confirm the nodes' successful registration with the hub by visiting the grid console at http://localhost:4444/grid/console.

**Capabilities:** Match the capabilities and Selenium versions between the tests and grid components. If you specify a browser version, verify the node's support for that version.

**Selenium Version Compatibility:** Make sure the Selenium server version for the hub and nodes aligns with your Java project's Selenium client library version.

**Test Execution:**

Tests are compiled and executed via tools like Maven. When tests initiate, they connect to the Selenium Hub. The Hub dispatches the test to a fitting node for execution.

**To see result:** allure serve allure-results 