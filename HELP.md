# https://youtrack.jetbrains.com/issue/IDEA-313869/IntelliJ-Spring-Facet-bean-discovery-on-transitive-dependencies

The `sub2` module appears as runtime dependency in the main module.
Thus the `sub2Bean` was not recognized as bean, and the autowiring error was shown in `Sun1Bean` class


What to check:

open `com.mytests.spring.springGradleTranstiveDependencies.sub3.Sub3Bean1` class and check that it has the Spring Bean gutter icon
open `com.mytests.spring.springGradleTranstiveDependencies.sub2.Sub2Bean1` class and check that it has the Spring Bean gutter icon and has no autowiring errors
open `com.mytests.spring.springGradleTranstiveDependencies.sub1.Sub1Bean1` class and check that no autowiring errors are shown there
