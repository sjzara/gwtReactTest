### GWT with JavaScript and React/JSX

Steve Zara Nov 2024

[GWT (Google Web Toolkit)](https://www.gwtproject.org/) is a way of using Java to write code that runs in browsers.  It transpiles 
Java to browser-specific optimised JavaScript. A considerable amount of the standard Java libraries
is provided, and additional libraries can be written using standard Java. A full-featured
GUI framework is included, using CSS for styling. GWT programs can integrate easily with JavaScript, so
can be used along with existing and new JavaScripts and frameworks.

##### Setting up a new application

A new GWT application is created using Maven:

mvn archetype:generate \\  
   -DarchetypeGroupId=net.ltgt.gwt.archetypes \\  
   -DarchetypeVersion=LATEST \\  
   -DarchetypeArtifactId=modular-webapp
   
 Three maven sub-projects will be created: 
 
 1. Client project. This contains Java code that will run in a browser.
 2. Server project. This contains server-side code as a Java Web Application (war) that can provide services to 
 the client.
 3. Shared project. This contains Java code that can be used both in the browser and on the server.
 
 The project can be built from Maven commands in the root project.
 
 *mvn install* will generate the full application. 
 
##### Running an application

Two services are needed for development:

1. The server for the web application. This includes standard web pages along with stylesheets and conventional JavaScript.  It also serves the browser-specific JavaScript that results from Java transpilation.
2. The source server. This provides source maps.

These can be run as follows:

**Web application**

*mvn jetty:run -pl \*-server -am -Denv=dev*

**Code server**

*mvn gwt:codeserver -pl \*-client -am*

The web application is then available at [http://localhost:8080](http://localhost:8080)

* Development process


##### JavaScript integration

There are two mechanisms provided in GWT to allow Java and JavaScript to interact. The first and oldest is called JSNI
[JavaScript Native Interface](https://www.gwtproject.org/doc/latest/DevGuideCodingBasicsJSNI.html) which uses the **native** method specifier to allow embedded JavaScript. 
Within this embedded code the parameters of the method can be accessed and global JavaScript objects are provided 
such as the window ("$wnd") and the document ("$doc"). 

JNSI is eventually going to be deprecated, and its currently available replacement is 
[JsInterop](https://www.gwtproject.org/doc/latest/DevGuideCodingBasicsJsInterop.html) which uses annotations to
expose Java classes and records to JavaScript code and to allow Java native methods to be mapped to JavaScript methods. 
This mechanism also allows callbacks to be implemented in Java.

