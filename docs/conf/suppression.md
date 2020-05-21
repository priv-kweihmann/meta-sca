# Suppression and fatal-error

Every tool has the possibility to suppress some of the findings.
Besides that some findings could be configured to terminate the build, e.g. when a nullptr-dereference is found in C-code.

## Global suppression and fatal-error

For this purpose you can configure global suppression or fatal-error.
In the subdirectory __recipes-sca-rules__ you can find __rules__-files for each tool.

E.g. when you want to configure the behavior of pylint when being invoked on an image, you need to modify (or overload in your own layer) the files from __sca-image-pylint__.

Each of these rule-recipe consists of two files

* suppress - which adds suppressions
* fatal - which adds fatal errors

### suppress file

In this file you can insert any error ID which should suppressed in output for the given tool and SCA-mode.
Per line one error-id could be inserted, which could be a regular expression as well.

### fatal file

In this file you can insert any error ID which terminates the build immediately.
Use this for e.g. regression.
Per line one error-id could be inserted, which could be a regular expression as well.

## Local suppression and fatal-error

Beside the global settings you could use the __SCA\_\<TOOLNAME\>\_EXTRA_SUPPRESS__ and __SCA\_\<TOOLNAME\>\_EXTRA_FATAL__ variables in each recipe to control the behavior.
Both global and local settings are being merged into the effective settings.

## Example

The following errors of the tool pylint are not of interest for you: 'warning1', 'someotherinfo', 'notofinteresterror'
So put into __recipes-sca-rules/sca-recipe-pylint-native/files/suppress__ and __recipes-sca-rules/sca-image-pylint-native/files/suppress__

```sh
pylint.pylint.warning1
pylint.pylint.someotherinfo
pylint.pylint.notofinteresterror
```

if you want furthermore suppress the pylint error 'someobscureinfo' for just the recipe 'foo'. Insert into __foo.bb__

```bitbake
SCA_PYLINT_EXTRA_SUPPRESS += "pylint.pylint.someobscureinfo"
```

if you'd like to suppress a whole range of issue use regular expressions like

```bitbake
pylint.pylint.notofinterest.*
```

or

```bitbake
SCA_PYLINT_EXTRA_SUPPRESS += "pylint.pylint.notofinterest.*"
```

## Suppression of single items

Additionally you can suppress findings on a case-by-case basis within every recipe.
Therefore you need to add a variable called __SCA_SUPPRESS_LOCALS__.

This variable is a space separated list of suppression instructions.
Each instruction it build e.g. like this

```shell
foo.c,pylint.pylint.warning1,20-30,*
```

This example suppresses any finding in the file **foo.c** of ID **pylint.pylint.warning1** between the source code lines **20-30**.

### Instruction syntax

| item       | possible values      | description
|:----------:|:---------------------|:-
| 1          | regular expression   | regular expression that matches the file name (including reletive path from \${S}-directory). All chars like ' or "" or spaces must be URL-coded (e.g. space = %020)
| 2          | regular expression   | regular expression that matched the error ID
| 3          | int, range or *      | specifies the line(s) of the finding which should be suppressed. Ranges should be configured as 'start-end', * means all values are matching
| 4          | int, range or *      | specifies the column(s) of the finding which should be suppressed. Ranges should be configured as 'start-end', * means all values are matching

### More examples

```shell
SCA_SUPPRESS_LOCALS = "foo.c,pylint.*,0-100,*"
```

> suppress all pylint issues between lines 0-100 in file foo.c

```shell
SCA_SUPPRESS_LOCALS = "test/.*,pylint.pylint.foowarn,*,*"
```

> suppress all pylint.pylint.foowarn issues in any file in folder test/ no matter what line or column they might appear

```shell
SCA_SUPPRESS_LOCALS = "foo.c,pylint.pylint.foowarn,50,0-20"
```

> suppress pylint.pylint.foowarn in foo.c at line 50, but only if it appears in the first 20 columns

```shell
SCA_SUPPRESS_LOCALS = "foo.c,pylint.pylint.foowarn,50,0-20 \
                       test/.*,pylint.pylint.foowarn,*,*"
```

> suppress pylint.pylint.foowarn in foo.c at line 50, but only if it appears in the first 20 columns +
> suppress all pylint.pylint.foowarn issues in any file in folder test/ no matter what line or column they might appear
