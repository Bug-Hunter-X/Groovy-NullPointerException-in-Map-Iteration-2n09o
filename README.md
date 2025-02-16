# Groovy NullPointerException in Map Iteration

This repository demonstrates a common error in Groovy: encountering a `NullPointerException` when a method expects a `Map` but receives `null` as input, which attempts to iterate over this null value.

The `bug.groovy` file shows the problematic code.  The `bugSolution.groovy` file provides a solution using safe navigation and null checks. 

## How to reproduce

1. Clone the repository
2. Run `bug.groovy` using a Groovy interpreter.

You should see a `NullPointerException`.

## Solution

The solution involves checking for null before iterating.  See `bugSolution.groovy` for an implementation using safe navigation.