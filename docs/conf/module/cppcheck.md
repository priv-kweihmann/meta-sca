# Configuration for cppcheck

## Supported environments/languages

* C
* C++

## Configuration

For further explanations on the variables see the manpage of cppcheck

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_CPPCHECK_RUNMODE | Choose the runmode of the tool. Fast or complete, while fast isn't capable of finding some issues | string: fast or complete | "fast"
| SCA_CPPCHECK_MAX_CONFIG | Number of configuration permutations, applies only to fastmode | int | "1"
| SCA_CPPCHECK_LIBRARY | cppcheck configuration to use | string | "std.cfg"
| SCA_CPPCHECK_LANG_STD | C standard to check on | space separated list | "c99"
| SCA_CPPCHECK_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".c .cpp .h .hpp"
| SCA_CPPCHECK_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_CPPCHECK_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_CPPCHECK_CHECK_DEPTH | Depth of analysis - higher value = higher effort | int | "3"
| SCA_CPPCHECK_ADD_INCLUDES | Additional paths leading to includes | space-separated-list | ""
| SCA_CPPCHECK_CHECKLEVEL | Check level - normal or exhaustive | space-separated-list | "normal"
| SCA_BLOCKLIST[cppcheck] | Blacklist filter for this tool | space-separated-list | "linux-*"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [x] security
* [x] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Quality

## Score mapping

### Error considered as security relevant

* cppcheck.cppcheck.arrayIndexOutOfBounds
* cppcheck.cppcheck.arrayIndexOutOfBoundsCond
* cppcheck.cppcheck.badBitmaskCheck
* cppcheck.cppcheck.bufferAccessOutOfBounds
* cppcheck.cppcheck.bufferNotZeroTerminated
* cppcheck.cppcheck.deadpointer
* cppcheck.cppcheck.deallocDealloc
* cppcheck.cppcheck.deallocret
* cppcheck.cppcheck.deallocuse
* cppcheck.cppcheck.doubleFree
* cppcheck.cppcheck.eraseDereference
* cppcheck.cppcheck.insecureCmdLineArgs
* cppcheck.cppcheck.incompleteArrayFill
* cppcheck.cppcheck.IOWithoutPositioning
* cppcheck.cppcheck.leakNoVarFunctionCall
* cppcheck.cppcheck.leakReturnValNotUsed
* cppcheck.cppcheck.leakUnsafeArgAlloc
* cppcheck.cppcheck.memleak
* cppcheck.cppcheck.memleakOnRealloc
* cppcheck.cppcheck.mismatchAllocDealloc
* cppcheck.cppcheck.negativeArraySize
* cppcheck.cppcheck.negativeIndex
* cppcheck.cppcheck.negativeMemoryAllocationSize
* cppcheck.cppcheck.outOfBounds
* cppcheck.cppcheck.pointerArithBool
* cppcheck.cppcheck.raceAfterInterlockedDecrement
* cppcheck.cppcheck.publicAllocationError
* cppcheck.cppcheck.resourceLeak
* cppcheck.cppcheck.stlBoundaries
* cppcheck.cppcheck.uninitdata
* cppcheck.cppcheck.uninitMemberVar
* cppcheck.cppcheck.uninitstring
* cppcheck.cppcheck.uninitStructMember
* cppcheck.cppcheck.uninitvar
* cppcheck.cppcheck.useAutoPointerMalloc
* cppcheck.cppcheck.terminateStrncpy
* cppcheck.cppcheck.thisSubtraction

### Error considered as functional defect

* cppcheck.cppcheck.argumentSize
* cppcheck.cppcheck.assertWithSideEffect
* cppcheck.cppcheck.assignBoolToPointer
* cppcheck.cppcheck.assignmentInAssert
* cppcheck.cppcheck.autoVariables
* cppcheck.cppcheck.autovarInvalidDeallocation
* cppcheck.cppcheck.boostForeachError
* cppcheck.cppcheck.charBitOp
* cppcheck.cppcheck.charLiteralWithCharPtrCompare
* cppcheck.cppcheck.checkCastIntToCharAndBack
* cppcheck.cppcheck.clarifyStatement
* cppcheck.cppcheck.compareBoolExpressionWithInt
* cppcheck.cppcheck.comparisonFunctionIsAlwaysTrueOrFalse
* cppcheck.cppcheck.constStatement
* cppcheck.cppcheck.coutCerrMisusage
* cppcheck.cppcheck.derefInvalidIterator
* cppcheck.cppcheck.divideSizeof
* cppcheck.cppcheck.duplInheritedMember
* cppcheck.cppcheck.exceptDeallocThrow
* cppcheck.cppcheck.exceptThrowInDestructor
* cppcheck.cppcheck.ignoredReturnValue
* cppcheck.cppcheck.incorrectLogicOperator
* cppcheck.cppcheck.incorrectStringBooleanError
* cppcheck.cppcheck.incorrectStringCompare
* cppcheck.cppcheck.integerOverflow
* cppcheck.cppcheck.invalidFunctionArg
* cppcheck.cppcheck.invalidFunctionArgBool
* cppcheck.cppcheck.invalidIterator1
* cppcheck.cppcheck.invalidIterator2
* cppcheck.cppcheck.invalidLengthModifierError
* cppcheck.cppcheck.invalidPointer
* cppcheck.cppcheck.invalidPrintfArgType_float
* cppcheck.cppcheck.invalidPrintfArgType_int
* cppcheck.cppcheck.invalidPrintfArgType_n
* cppcheck.cppcheck.invalidPrintfArgType_p
* cppcheck.cppcheck.invalidPrintfArgType_s
* cppcheck.cppcheck.invalidPrintfArgType_sint
* cppcheck.cppcheck.invalidPrintfArgType_uint
* cppcheck.cppcheck.invalIDscanf
* cppcheck.cppcheck.invalidScanfArgType_float
* cppcheck.cppcheck.invalidScanfArgType_int
* cppcheck.cppcheck.invalidScanfArgType_s
* cppcheck.cppcheck.invalidScanfFormatWidth
* cppcheck.cppcheck.invalidTestForOverflow
* cppcheck.cppcheck.iterators
* cppcheck.cppcheck.literalWithCharPtrCompare
* cppcheck.cppcheck.mallocOnClassError
* cppcheck.cppcheck.mallocOnClassWarning
* cppcheck.cppcheck.memsetClass
* cppcheck.cppcheck.memsetClassReference
* cppcheck.cppcheck.memsetValueOutOfRange
* cppcheck.cppcheck.memsetZeroBytes
* cppcheck.cppcheck.mismatchingContainers
* cppcheck.cppcheck.mismatchSize
* cppcheck.cppcheck.moduloAlwaysTrueFalse
* cppcheck.cppcheck.multiplySizeof
* cppcheck.cppcheck.nullPointer
* cppcheck.cppcheck.nullPointerDefaultArg
* cppcheck.cppcheck.nullPointerRedundantCheck
* cppcheck.cppcheck.operatorEqMissingReturnStatement
* cppcheck.cppcheck.operatorEqToSelf
* cppcheck.cppcheck.operatorEqVarError
* cppcheck.cppcheck.oppositeInnerCondition
* cppcheck.cppcheck.pointerSize
* cppcheck.cppcheck.possibleBufferAccessOutOfBounds
* cppcheck.cppcheck.preprocessorErrorDirective
* cppcheck.cppcheck.readWriteOnlyFile
* cppcheck.cppcheck.redundantAssignInSwitch
* cppcheck.cppcheck.redundantCopyInSwitch
* cppcheck.cppcheck.returnAddressOfAutoVariable
* cppcheck.cppcheck.returnAddressOfFunctionParameter
* cppcheck.cppcheck.returnLocalVariable
* cppcheck.cppcheck.returnReference
* cppcheck.cppcheck.returnTempReference
* cppcheck.cppcheck.seekOnAppendedFile
* cppcheck.cppcheck.selfAssignment
* cppcheck.cppcheck.selfInitialization
* cppcheck.cppcheck.shiftNegative
* cppcheck.cppcheck.shiftTooManyBits
* cppcheck.cppcheck.signConversion
* cppcheck.cppcheck.signedCharArrayIndex
* cppcheck.cppcheck.sizeArgumentAsChar
* cppcheck.cppcheck.sizeofCalculation
* cppcheck.cppcheck.sizeofDivisionMemfunc
* cppcheck.cppcheck.sizeofsizeof
* cppcheck.cppcheck.sizeofwithnumericparameter
* cppcheck.cppcheck.sizeofwithsilentarraypointer
* cppcheck.cppcheck.sprintfOverlappingData
* cppcheck.cppcheck.staticStringCompare
* cppcheck.cppcheck.stlcstr
* cppcheck.cppcheck.stlIfFind
* cppcheck.cppcheck.StlMissingComparison
* cppcheck.cppcheck.stlOutOfBounds
* cppcheck.cppcheck.stringCompare
* cppcheck.cppcheck.stringLiteralWrite
* cppcheck.cppcheck.strncatUsage
* cppcheck.cppcheck.strPlusChar
* cppcheck.cppcheck.suspiciousCase
* cppcheck.cppcheck.suspiciousEqualityComparison
* cppcheck.cppcheck.suspiciousSemicolon
* cppcheck.cppcheck.throwInNoexceptFunction
* cppcheck.cppcheck.unknownEvaluationOrder
* cppcheck.cppcheck.unusedLabelSwitch
* cppcheck.cppcheck.useAutoPointerArray
* cppcheck.cppcheck.useAutoPointerContainer
* cppcheck.cppcheck.useClosedFile
* cppcheck.cppcheck.uselessAssignmentPtrArg
* cppcheck.cppcheck.uselessCallsCompare
* cppcheck.cppcheck.uselessCallsEmpty
* cppcheck.cppcheck.uselessCallsRemove
* cppcheck.cppcheck.va_end_missing
* cppcheck.cppcheck.va_list_usedBeforeStarted
* cppcheck.cppcheck.va_start_referencePassed
* cppcheck.cppcheck.va_start_subsequentCalls
* cppcheck.cppcheck.va_start_wrongParameter
* cppcheck.cppcheck.virtualDestructor
* cppcheck.cppcheck.writeReadOnlyFile
* cppcheck.cppcheck.wrongmathcall
* cppcheck.cppcheck.wrongPipeParameterSize
* cppcheck.cppcheck.wrongPrintfScanfArgNum
* cppcheck.cppcheck.wrongPrintfScanfParameterPositionError
* cppcheck.cppcheck.zerodiv
* cppcheck.cppcheck.zerodivcond

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* cppcheck.cppcheck.*
