# Output formats

With the help of the variable __SCA_EXPORT_FORMAT__ you can specify the format(s) of the output.
Currently supported are

* checkstyle
* codeclimate
* console
* diff
* plain
* sarif
* sonarqube
* stat

to enable multiple formats separate the string with spaces

## Checkstyle format

Currently used in version ```4.3``` of the checkstyle schema.

An example output looks like this

```xml
<?xml version="1.0" ?>
<checkstyle version="4.3">
  <file name="/mnt/mydisk/openembedded-core/build/tmp/deploy/images/qemux86/sca/sources/simple-c/simple-hello-world.c">
    <error column="1" line="23" message="[Package:simple-c Tool:cppcheck] Array 'c[250]' accessed at index -1, which is out of bounds." severity="error" source="cppcheck.cppcheck.negativeIndex"/>
    <error column="1" line="20" message="[Package:simple-c Tool:cppcheck] Array 'c[250]' accessed at index -1, which is out of bounds." severity="error" source="cppcheck.cppcheck.negativeIndex"/>
  </file>
</checkstyle>
```

The hierarchy of the document is the following

* root
  * checkstyle
    * file
      * error

each sub-element below **checkstyle** can occur n-times.

### Attributes

| node       | attribute | description
|:----------:|:----------|:-
| checkstyle | version   | fixed to 4.3
| error      | column    | starting column of the finding
| error      | line      | starting line of the finding
| error      | message   | the human readable message of the finding
| error      | severity  | the set severity of the finding
| error      | source    | the unique error-ID of the finding
| file       | name      | full path of the file with findings

## Console format

Each finding will be put into a single line.

Example output looks like this

```shell
[error] /full/path/to/simple-hello-world.c :23:1 - Array 'c[250]' accessed at index -1, which is out of bounds. - [cppcheck.cppcheck.negativeIndex]
[error] /full/path/to/simple-hello-world.c :20:1 - Array 'c[250]' accessed at index -1, which is out of bounds. - [cppcheck.cppcheck.negativeIndex]
```

General format is the following

```shell
[{severity}] {file}:{line}:{column} - {message} - [{id}]
```

| value      | description
|:----------:|:-
| {column}   | starting column of the finding
| {file}     | path of the file relative to source directory
| {id}       | the unique error-ID of the finding
| {line}     | starting line of the finding
| {message}  | the human readable message of the finding
| {severity} | the set severity of the finding

## diff format

The diff format is the same as [console output](#console-format), but shows only the items changed since the last run.
So this mode might be useful when actively working on recipes and sources

## stat format

This export format is structured-acceptance-test exports and can be used in several editions of Gitlab.
The complete format is described [here](https://github.com/fulldecent/structured-acceptance-test/blob/master/Stat-Output.md)

## sarif format

This export format is compatible to [SARIF](https://sarifweb.azurewebsites.net/#Specification).
It is a JSON file based on the this [json schema](https://raw.githubusercontent.com/oasis-tcs/sarif-spec/master/Schemata/sarif-schema-2.1.0.json)

## sonarqube format

Exports the issues as a SonarQube generic import format as described on https://docs.sonarqube.org/latest/analysis/generic-issue/.

## codeclimate format

Exports the issues as a SonarQube generic import format as described on https://docs.gitlab.com/ee/user/project/merge_requests/code_quality.html#implementing-a-custom-tool.

## plain format

Each finding will be put into a single line - it's pretty much the same as the console format, but without the severity.
In this mode bitbake will take over the severity part.

Example output looks like this

```shell
/full/path/to/simple-hello-world.c :23:1 - Array 'c[250]' accessed at index -1, which is out of bounds. - [cppcheck.cppcheck.negativeIndex]
/full/path/to/simple-hello-world.c :20:1 - Array 'c[250]' accessed at index -1, which is out of bounds. - [cppcheck.cppcheck.negativeIndex]
```

General format is the following

```shell
{file}:{line}:{column} - {message} - [{id}]
```

| value      | description
|:----------:|:-
| {column}   | starting column of the finding
| {file}     | path of the file relative to source directory
| {id}       | the unique error-ID of the finding
| {line}     | starting line of the finding
| {message}  | the human readable message of the finding
