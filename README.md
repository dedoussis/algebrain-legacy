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

## Examples from the Algebrain Terminal

``` 
# Differentiates and then simplifies given expression

[22:23:28] You: 2*x^5+3/x-7*sin(x)
[22:23:38] Sys: diff(2*x^5+3/x-7*sin(x),x)
[22:23:43] Sys: 0*x^5+2*1*5*x^4+(0*x-3)/x^2-(0*sin(x)+7*cos(x))
[22:23:48] Sys: 0+2*5*x^4+(-3)/x^2-(0+7*cos(x))
[22:23:49] Sys: 2*5*x^4+(-3)/x^2-7*cos(x)
[22:24:00] Sys: 2*5*x^4+(-3)/x^2-7*cos(x)
```

``` 
# Factorisation

[18:23:23] You: y^2+y^9
[18:23:32] Sys: nfact(y^2+y^9,2)
[18:23:34] Sys: nfact(y^0*(y^2+y^9),2)
[18:23:36] Sys: nfact(y^1*(y^1+y^8),1)
[18:23:36] Sys: y^2*(y^0+y^7)
[18:23:40] Sys: y^2*(1+y^7)
```
``` 
# Trigonometric Identities

[22:33:04] You: sin(x)^2+cos(x)^2+sin(-x)*(sin(x)/cos(x))
[22:33:11] Sys: trgid(sin(x)^2+cos(x)^2+sin(-x)*(sin(x)/cos(x)))
[22:34:56] Sys: 1+(-sin)*tan(x)
```

To get an idea of how transformation rules are structured you can go through the default transformations of algebrain in [src/main/resources/transformations](https://github.com/dedoussis/algebrain/tree/master/src/main/resources/transformations).

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
