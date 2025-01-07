# Scala Auxiliary Constructor Value Override Issue

This repository demonstrates a subtle issue that can occur when using auxiliary constructors in Scala classes.  The problem involves overriding the value of a parameter defined in the primary constructor within an auxiliary constructor. The solution explains how to correctly handle this scenario.

## Problem

In the provided example `MyClass`, the auxiliary constructor attempts to directly override the `value` parameter. While this compiles, it does not behave as one might expect. This leads to unexpected behavior when attempting to modify the `value` parameter within the auxiliary constructor.

## Solution

The solution showcases the correct method for defining auxiliary constructors in Scala.  Instead of attempting to directly override the `value` parameter, the solution demonstrates how to initialize the value and use additional methods for changing the value if necessary. This prevents unexpected behavior and maintains the integrity of the class.