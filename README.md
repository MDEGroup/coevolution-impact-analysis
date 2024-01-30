# README for MetaModel Evolution Project

## Sirius/EMF

This README documents the series of commits made to the MetaModel Evolution Project repository. Each commit corresponds to specific evolution scenarios that have been applied to the metamodel. These scenarios include adding new concepts, modifying existing ones, and removing outdated elements. The changes aim to evolve the metamodel to adapt to new requirements and improve its functionality and usability.

### Commit List
- [Commit S0](https://github.com/MDEGroup/coevolution-impact-analysis/tree/7fffa200efbf1fe68012a25270176b2de2e4768a) - This commit stores the original implementation of the StateMachine modeling tools.
- [Commit S1](https://github.com/MDEGroup/coevolution-impact-analysis/tree/31a0f61511f404b81f1d6ad7b7cf15c4aaee489c) - Add Concept to Metamodel: Added a new Reset element to the State machine metamodel. This Reset has a set of events that trigger it.
- [Commit S2](https://github.com/MDEGroup/coevolution-impact-analysis/tree/b9f9d424151add89df09cb1ad67ebe39bfdbd732) - Add Constraint: Imposed a constraint where only one Reset can be defined in a State machine, and it can have only one Transition to a State there.
- [Commit S3](https://github.com/MDEGroup/coevolution-impact-analysis/tree/69f4ae3cd8b5fd80b0c7545f22432acf9ff60269) - Add Notation: Introduced a symbol for Reset and associated it with the Reset element.
- [Commit S4-S6](https://github.com/MDEGroup/coevolution-impact-analysis/tree/3728b6e924f57c16d8971f31d02f01327495e465) - Rename Concepts: Renamed the 'State' element in the metamodel to 'Situation.' No changes were made as constraints do not have names. Renamed the sub-symbol used in the Situation’s symbol.
- [Commit S7-S9](https://github.com/MDEGroup/coevolution-impact-analysis/tree/199eeeda9956374b475fc5b4cf04d0a26add99e0) - Remove Element from Metamodel: Removed the Reset element from the State machine. Eliminated the constraint allowing Reset to have a Transition to Situation. Removed the symbol associated with Reset.
- [Commit S10](https://github.com/MDEGroup/coevolution-impact-analysis/tree/5ac4d0999557d6eb94098badb4fe5684fb98d685) - Change Metamodel: Modified the Transition's Trigger to be specified at the Source end of the relationship.
- [Commit S11](https://github.com/MDEGroup/coevolution-impact-analysis/tree/bff1c9142a5be5215b5ff7caedb60c3933c474a2) - Change Constraint: Added Start, updated old Reset constraints to apply to Start, and allowed Start to be the Source of a Transition to a Situation.
- [Commit S12](https://github.com/MDEGroup/coevolution-impact-analysis/tree/f115b9189ebc0a23b692e06df2a64ae55518c24a) - Change Notation: Updated the Situation symbol to refer to a different subsymbol.

## Jjodel Replication

To replicate the experiment and understand the impact of these changes, please refer to the Jjodel build bundle available at: [Jjodel Build Bundle](https://mdegroup.github.io/coevolution-impact-analysis/).

---

## Additional Information

This project is an ongoing effort and contributions are welcome. For more information or if you have any questions, please open an issue in the repository.
