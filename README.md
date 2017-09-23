# Computer Algebra System
Computer Algebra System focusing on symbolic transformations:

## High level description
Symbolic computation, also called computer algebra, is a field of computational mathematics,
which refers to algorithms and software systems designed explicitly for the manipulation
of symbolic expressions. Computer algebra systems are software packages specialised
in symbolic computation. Apart from numerically evaluating algebraic expressions, these
systems are capable of applying transformations such as differentiation or simplification
on a given expression. This project investigates the extend to which this transformation
feature can be approached from a more dynamic and user-oriented perspective. Rewriting
methods are employed to allow the user to define a customised transformation applicable
on any symbolic expression. The system implemented enables the user to represent, handle
and manipulate symbolic expressions using custom transformations within a friendly and
functional GUI environment.

## System features
**File**
* New: Initiates a new CAS application frame window.
* Import: Imports a .txt file of a previous exported terminal history. Loads the
imported history into terminal.
* Export as .txt: Creates a .txt file of the terminal contents.
* Close: Closes current CAS application frame window.
**Transformations**
* New transformation wizard: Initiates the facility where the user can insert a set of
rewriting rules and create a new transformation. The transformation is stored in the
system for later use.
* Manage Transformations: Initiates the facility where the user can preview, edit or
delete already stored transformations.
**Tools**
* Show tree: Displays the internal tree structure design of the current expression.
* Clear terminal: Deletes terminal history.
* Load setup: Automatically loads the pre-set transformation objects of differentiation
and simplification, storing both of them in the transformation list of the system.
**Help**
* Provides links to online documentation and user manual.
**About**
* Presents software credits.
