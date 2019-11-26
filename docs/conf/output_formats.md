# Output formats

With the help of the variable __SCA_EXPORT_FORMAT__ you can specify the format of the output.
Currently supported are

* checkstyle
* console

## Checkstyle format

Currently used in version ```4.3``` of the checkstyle schema.

An example output looks like this

```xml
<?xml version="1.0" ?>
<checkstyle version="4.3">
  <file name="/mnt/8c1099ed-0d1c-473d-b1e0-8425ab645cef/poky/build/tmp/deploy/images/qemux86/sca/sources/simple-c/simple-hello-world.c">
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
[error] simple-hello-world.c:23:1 - Array 'c[250]' accessed at index -1, which is out of bounds. - [cppcheck.cppcheck.negativeIndex]
[error] simple-hello-world.c:20:1 - Array 'c[250]' accessed at index -1, which is out of bounds. - [cppcheck.cppcheck.negativeIndex]
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
