The GOBLIN tool has been integrated into the GRaViTY tool: https://github.com/GRaViTY-Tool

This repository only hosts the version presented on [FASE 2018](https://www.etaps.org/index.php/2018/fase) and will not receive any maintenance.
Please use the GRaViTY tool if you are not explicitly interested in this specific version of GOBLIN.
<!---
The work contained in this repository has been published as:

[Sven Peldszus, Géza Kulcsár, Malte Lochau, Sandro Schulze: Continuous Detection of Design Flaws in Evolving Object-Oriented Programs using Incremental Multi-pattern Matching. In: Proceedings of the 31st International Conference on Automated Software Engineering (ASE), September 2016](https://doi.org/10.1145/2970276.2970338)--->

# GOBLIN - Generic Objective-Based Layout Improvements for Non-designs

Refactorings constitute an effective means to improve quality
and maintainability of evolving object-oriented programs. Searchbased
techniques have recently shown very promising results in semiautomatically
solving the underlying multi-objective optimization problem,
namely: finding optimal sequences of behavior-preserving program
transformations that (1) maximize code-quality metrics and (2) minimize
the number of changes. However, besides purely functional behavior
preservation, the impact of refactorings on extra-functional properties
like security have received only little attention so far. To this end,
we propose as a further objective of refactorings to minimize the size of
the attack surface of programs (i.e., to maximize strictness of declared
accessibility of class members). Minimizing the attack surface naturally
competes with applicability of established move-method-refactorings for
improving coupling/cohesion metrics. 

This site contains the source code of our tool implementation GOBLIN, as well as the results of our experimental evaluation which show the impact of attack surface minimization on design-improving refactorings by using different accessibility control strategies.

## Installation and Usage

### Requirements:

- Eclipse Modeling Tools (tested with Oxygen.1)
- Henshin (available at the Eclipse Marketplace)
- MOMoT (installation instructions at [http://martin-fleck.github.io/momot/eclipse/updates/](http://martin-fleck.github.io/momot/eclipse/updates/))
- Hulk (installation instructions at [https://github.com/GRaViTY-Tool/GRaViTY-Tool.github.io](https://github.com/GRaViTY-Tool/GRaViTY-Tool.github.io))
 



### Installation:
1. Download the GOBLIN source from [src](https://github.com/Echtzeitsysteme/goblin-fase-2018/tree/master/src)
2. Import GOBLIN as Eclipse projects
3. Import source code of Java projects to be analysed into the freshly opened workspace

### Usage:

1. Create Program graphs of the Java projects that should be analyzed via rightclick on the project -> GRaViTY -> Generate Program Graph
2. Change the value of the parameter "INITIAL_MODEL" of SearchParameters.java in the folder "src.momotFiles" to match the path of the generated Program graphs
3. Run "SearchTypeGraph.java" as Java Application
4. After the optimization several folders will be created containing evaluation data 
  - the folder solutions contains a text file for each final solution on the pareto front. The file will contain the Refactorings of the solution.
  - The folder objectives contains a file listing the different fitness values of all final solutions.
 5. The tests can be executed via the Tests.launch file, new tests can be added via the "Test Workspace.launch" file

## Evaluation

We evaluated GOBLIN on an established corpus of 8 open-source Java projects selected from related literature on anti-pattern and code smell detection. Sources for the corpus are:

- [Moha et al.: DECOR - A Method for the Specification and Detection of Code and Design Smells. In: Transactions on Software Engineering, vol. 36, 2010.](http://www.irisa.fr/triskell/publis/2009/Moha09d.pdf)
- [Khomh et al.: BDTEX - A GQM-based Bayesian Approach for the Detection of Antipatterns. In: Journal of Systems and Software, vol. 84, 2011.](http://dl.acm.org/citation.cfm?id=1942375)
- [Ujhelyi et al.: Anti-Pattern Detection with Model Queries: A Comparison of Approaches. In: Proceedings of CSMR-WCRE 2014.](http://publicatio.bibl.u-szeged.hu/4761/1/2498771.pdf)
- [Peldszus et al.: Continuous detection of design flaws in evolving object-oriented programs using incremental multi-pattern matching. In: Proceedings of the 31st IEEE/ACM International Conference on Automated Software Engineering.](https://dl.acm.org/citation.cfm?id=2970338)



Based on these papers and our own investigations for simple examples, the following projects has been selected for the evaluation corpus:

- [Gantt, version 1.10.2](https://sourceforge.net/projects/ganttproject/files%2FOldFiles/): an open-source project scheduling and management tool
- [JHotDraw, version 7.6](https://sourceforge.net/projects/jhotdraw/): a two-dimensional graphics framework for structured drawing editors
- [JSciCalc, version 2.1.0](https://sourceforge.net/projects/jscicalc/files/jscicalc/): an open-source scientific calculator
- [JUnit, version 3.8.2](http://repo1.maven.org/maven2/junit/junit/3.8.2/): an open-source unit testing framework
- [log4j, version 1.2.17](https://logging.apache.org/log4j/1.2/source-repository.html): an open-source logging lramework for Java
- [Lucene, version 1.4.3](http://archive.apache.org/dist/lucene/java/): an open-source indexing and search engine
- [Nutch, version 0.9](http://archive.apache.org/dist/nutch/): an open-source Web crawler
- [QuickUML, version 2001](https://sourceforge.net/projects/quj/files/): an open-source, light-weight UML editor




The source code for all projects of our corpus can be found under [test_data](https://github.com/Echtzeitsysteme/goblin-fase-2018/tree/master/test_data). Evaluation results can be found under [evaluation_results](https://github.com/Echtzeitsysteme/goblin-fase-2018/tree/master/evaluation_results).

