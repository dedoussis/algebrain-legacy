# Algebrain

Algebrain is a general purposed Computer Algebra System, that allows numerical evaluation and symbolic transofrmation of algebraic expressions. By exploiting the concept of rewriting rules, Algebrain enables the use of custom transformations, that can be entirely developed and compiled within its environment.  

## Getting Started

### Prerequisites

* Java 1.8
* Maven 3.5.3

### Setup

The following commands will get the project up and running for development:
``` bash
# Clone project
git clone https://github.com/dedoussis/algebrain.git
cd algebrain

# Install dependencies and compile
mvn compile
```

Runnable JAR for distribution:  
``` bash
# Create a runnable JAR and install it in your local repository
mvn install
```

## Run Unit Tests

``` bash
mvn test
```

## Project Background

The core of the project has been produced during the 4-month dissertation period of my masters degree. Since then I've been working on Algebrain as a side project, improving the code-base now and then. Suggestions and contributions are greatly appreciated.  

### Userguide

Detailed insights on how Algebrain works as well as help to get you started with the syntax of the Algebrain language can be found within the userguide document of this repository. 

### Future Work

* Adding support of floating point values. The current prototype supports integers only. (Prioritised)
* Handle faulty inifinite looping transformations. (Prioritised)
* Enabling a variety of transformation strategies. Currently transformations are performed using a top-to-bottom approach. Even though this is efficient for a lot of transormations, there are transformations for which a botton-to-top approach would be more efficient. System to adapt strategy with regards to nature of transformation.
* As a further ambition, abandon the GUI implementation, and proceed with a complete API integration of the system.

## Built With

* [ANTLR4](http://www.antlr.org/) - Parsing
* [Maven](https://maven.apache.org/) - Dependency Management
