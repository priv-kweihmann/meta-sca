# How to add your own module

This page should show you how to integrate your very own linting module into sca.

For now this should be about modules working on recipes

## Prerequisites

* a command lint tool compiler as a native-tool
  * in best case (which will be described here) the tool takes multiple files as input arguments and returns each finding on a single line via stdout

For consistency throughout this document we will call the tool `myfoolint`, which is served by a recipe called `myfoolint-native`

## Describe your tool

Internally all tools are described by a json file, which defines some needed information like check scope, a.s.o.

So lets assume your tool is build by recipe `myfoolint-native`, you need to add a file called `myfoolint.sca.description` into the recipe scope (mostly under `path/to/your/recipe/files/myfoolint.sca.description`).

Then add the following code blocks into your tool recipe

```bitbake
SRC_URI += "file://myfoolint.sca.description"
FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/myfoolint.sca.description ${D}${datadir}/
}
```

### Content of the description file

As already mentioned the description file is a json which usually looks like this

```javascript
{
    // information how long it takes to build the tool itself on a scale between 0 (worst) - 10 (best)
    "buildspeed": 7,
    // information how long it takes for an execution run of the tool on a scale between 0 (worst) - 10 (best)
    "execspeed": 10,
    // list of languages supported by the tool - Please mind that entries should be lowercase only
    "languages": [
        "example"
    ],
    // information how 'good' the findings of the tool are on a scale between 0 (worst) - 10 (best)
    "quality": 8,
    // defines the scope(s) of the tool. Possible entries are 'security', 'functional', 'compliance' and/or 'style'
    "scope": [
        "style"
    ],
    // defines a regex matching for the finding ID against the scope, is case the tool has
    // multiple scopes.
    // NOTE: all the scope defined above at 'scope' should be found here as well
    "score": {
        "style": [
            // This defines that all IDs of the tool are matched to style scope
            "myfoolint.myfoolint..*"
        ]
    }
}
```

**NOTE**: The inline comments are here just for explanation, please remove them in the final implementation.

In case your unsure if your description is valid, you can check it against a json-schema to be found under `files/description-schema.json` in the `meta-sca` layer

## Create classes

### sca class

Create a file called `sca-myfoolint.bbclass` under `classes` in your layer.

The file contains the following needed functions and `inherit` statements (for better readability the statements from the function bodies are removed here)

Also mind the inline comments

```bitbake
# Defines recipe scope suppress and fatal entries
SCA_<TOOL_CAPITALIZED>_EXTRA_SUPPRESS ?= ""
SCA_<TOOL_CAPITALIZED>_EXTRA_FATAL ?= ""

# Sets the output format of the tool
SCA_RAW_RESULT_FILE[<TOOL>] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

# Converter function
def do_sca_conv_<TOOL>(d):
    ...

# Bitbake task
python do_sca_<TOOL>() {
    ...
}

# Reporting task
python do_sca_<TOOL>_report() {
    ...
}

# Announce the bitbake tasks
addtask do_sca_<TOOL> after do_configure before do_sca_tracefiles
addtask do_sca_<TOOL>_report after do_sca_tracefiles before do_sca_deploy

# add the dependencies for the tool and rules
# more on that later
DEPENDS += "\
            <TOOL>-native \
            sca-recipe-<TOOL>-rules-native \
           "
```

which makes it the following for the example `myfoolint`

```bitbake
SCA_MYFOOLINT_EXTRA_SUPPRESS ?= ""
SCA_MYFOOLINT_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[myfoolint] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_myfoolint(d):
    ...


python do_sca_myfoolint() {
    ...
}

python do_sca_myfoolint_report() {
    ...
}

addtask do_sca_myfoolint after do_configure before do_sca_tracefiles
addtask do_sca_myfoolint_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "\
            myfoolint-native \
            sca-recipe-myfoolint-rules-native \
           "
```

### Create needed rule recipe

As you might have guessed from the `DEPENDS` append in the `classes/sca-myfoolint.bbclass` file, we will need a `suppress` and a `fatal` file.

These will be served by a recipe called `sca-recipe-myfoolint-rules-native`.

This one needs to be created anywhere in your layer, but best would be under `recipes-sca-rules/sca-recipe-myfoolint-rules-native/sca-recipe-myfoolint-rules-native.bb`

Furthermore create two (for now) empty files

* `recipes-sca-rules/sca-recipe-myfoolint-rules-native/files/suppress`
* `recipes-sca-rules/sca-recipe-myfoolint-rules-native/files/fatal`

The content of `recipes-sca-rules/sca-recipe-myfoolint-rules-native/sca-recipe-myfoolint-rules-native.bb` should look like this

```bitbake
SUMMARY = "SCA ruleset for myfoolint at recipes"
DESCRIPTION = "Rules to configure how myfoolint is affecting the build"

SRC_URI = "file://suppress \
           file://fatal"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

inherit native

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/fatal" "${D}${datadir}/myfoolint-recipe-fatal"
    install "${WORKDIR}/suppress" "${D}${datadir}/myfoolint-recipe-suppress"
}

FILES_${PN} = "${datadir}"
```

**NOTE**: you could apply any different `LICENSE` if you like, but contributing the final implementation back to `meta-sca` would only work if it's licensed `BSD-2-Clause`

### Bringing life to the sca class

Now it's time to bring some life into `sca-myfoolint.bbclass`.

First of all we need to code `do_sca_myfoolint` function

#### Coding the bitbake task

The function `do_sca_myfoolint` does the following

* prep the environment
* find any files that should be linted
* execute linter tool

The function `do_sca_myfoolint_report` does the following

* convert result of linting
* eval result and store it

a full coded example would look like this, please mind the inline comments for further explanation

```bitbake
python do_sca_myfoolint() {
    import os
    import subprocess
    # First of all the local assigned suppress and fatal entries are merged
    # with the global ones, defined by the sca-recipe-myfoolint-rules-native recipe

    # Create a argument list, like the tool needs to be run
    # in this very example it is just the tool with all to be checked files as arguments.
    #
    # But you can add as many arguments as you like.
    # For readability reasons it would be nice to put each argument onto a single line
    # with args += ["another_arg"]
    _args = ["myfoolint"]

    # Find files that should be checked
    #
    # The layer offers you different convenience functions to find files
    # by different criteria and returns a list of files, without any baggage such as
    # test files, out of tree files, a.s.o
    #
    # get_files_by_shebang(d, path, pattern, excludes=[])
    #     return - files with a matching shebang entry in the first line of the file
    #
    #     args
    #         d  - datasmart object create by bitbake
    #         path - path where to search for files. This should be d.getVar("SCA_SOURCES_DIR") for nearly every case
    #         pattern - a regex describing the shebang. Example if you want /bin/foo is should .*/foo
    #         excludes - files to exclude from return
    #
    # get_files_by_mimetype(d, path, mime, excludes=[])
    #     return - files matching the mime-type requested
    #
    #     args
    #         d  - datasmart object create by bitbake
    #         path - path where to search for files. This should be d.getVar("SCA_SOURCES_DIR") for nearly every case
    #         mime - Mime type. Example if you want all json-files it should be application/json
    #         excludes - files to exclude from return
    #
    # get_files_by_glob(d, pattern, excludes=[])
    #     return - files matching the glob(s) requested
    #
    #     args
    #         d  - datasmart object create by bitbake
    #         pattern - a space separated list of glob expressions
    #         excludes - files to exclude from return
    #
    # get_files_by_extention(d, path, pattern, excludes=[])
    #     return - files matching by file extension(s)
    #
    #     args
    #         d  - datasmart object create by bitbake
    #         path - path where to search for files. This should be d.getVar("SCA_SOURCES_DIR") for nearly every case
    #         pattern - list or space separated list of file extension(s). Example all .txt files can be found by passing ".txt" as argument
    #         excludes - files to exclude from return
    #
    #
    # Note on excludes parameter
    #
    # to exclude stuff like test files, out of tree files, a.s.o. use the following command
    # sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
    # which does performs all the needed thing automatically
    #
    # In this very example we are searching for all files in path ending on .example
    _files = get_files_by_extention(d,
                                    d.getVar("SCA_SOURCES_DIR"),
                                    ".example",
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    # Run the command wrapper, this will automatically execute the tool
    cmd_output = exec_wrap_check_output(_args, _files)

    # Write raw result to referenced file
    with open(sca_raw_result_file(d, "myfoolint"), "w") as o:
        o.write(cmd_output)
}

python do_sca_myfoolint_report() {
    # Now it time to convert the raw findings into the sca data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/myfoolint.dm".format(d.getVar("T")))
    # for this purpose an extra function exists. Here in our case it's called do_sca_conv_myfoolint
    dm_output = do_sca_conv_myfoolint(d)
    # Store the resulting data model
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    # Do the aftermath
    # this means check for fatal findings, which would terminate the build here
    # convert data model into the selected global export format (mostly checkstyle)
    # and deploy all the needed files to the dir defined by SCA_EXPORT_DIR-var
    sca_task_aftermath(d, "myfoolint", get_fatal_entries(d, "SCA_MYFOOLINT_EXTRA_SUPPRESS", 
                       d.expand("${STAGING_DATADIR_NATIVE}/myfoolint-${SCA_MODE}-suppress")))
}
```

### Coding the converter function

As said in the section before, there is a extra converter function, which does convert raw tool output (mostly text) into a sca data model representation.

As the input is mostly text, we need a regular expression to extract the needed information, which could be

* file
* line (optional)
* column (optional)
* severity of finding
* error classification ID
* message

you could use online tools like [Pythex](https://pythex.org/) to create your regex.

**NOTE**: please use named capture groups inside of the regex, which will make life much easier, as you could address them by name not only by an index

Lets assume our tool `myfoolint` produces output like the following

```text
/full/path/to/the/file.example:WARNING:1:2 [severe-warning]: This is a very severe warning
/full/path/to/the/file.example:INFO:10:2 [some-interesting-insight]: Found out some very interesting stuff about the code
/full/path/to/the/anotherfile.example:ERROR:1:1 [syntax-error]: Can't parse input file
```

then the regex would be

```text
^(?P<file>.*):(?P<severity>WARNING|ERROR|INFO):(?P<line>\d+):(?P<column>\d+)\s+\[(?P<id>.*)\]:\s+(?P<msg>.*)
```

when that's done we can now code the converter function. Please mind the inline comments for further explanation

```python
def do_sca_conv_myfoolint(d):
    import os
    import re

    # add some variables, describing current package name and the build path
    # these will be needed later
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    # add our identified regex pattern
    pattern = r"^(?P<file>.*):(?P<severity>WARNING|ERROR|INFO):(?P<line>\d+):(?P<column>\d+)\s+\[(?P<id>.*)\]:\s+(?P<msg>.*)"

    # as internally only severities 'error', 'warning' and 'info' are defined
    # we need to convert the tools severity to internal model
    # this can be done by a map
    severity_map = {
        "ERROR" : "error",
        "WARNING" : "warning",
        "INFO": "info"
    }

    # Initialize the internal model - this line is mandatory
    _suppress = sca_suppress_init(d, "SCA_MYFOOLINT_EXTRA_FATAL",
                                  d.expand("${STAGING_DATADIR_NATIVE}/myfoolint-${SCA_MODE}-fatal"))
    # local scope list of findings, so we don't need to de-/serialize the whole model
    # on every finding - this improves the overall performance a lot
    _findings = []

    # Try to open the raw result file
    if os.path.exists(sca_raw_result_file(d, "myfoolint")):
        with open(sca_raw_result_file(d, "myfoolint")) as f:
            # loop over all matching pattern
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    # Create an data model object with all the available information
                    # if a certain information bit isn't available you can
                    # remove the parameter from the function call for all
                    # optional items.
                    # For all other items you need to find an appropriate replacement or
                    # insert a fixed string.
                    # Also see next section for some more information
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="myfoolint",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Column=m.group("column"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity=severity_map[m.group("severity")])
                    # Check if finding should be suppressed by any local or global rule
                    if _suppress.Suppressed(g):
                        continue
                    # Check if finding matches the configured global scope of findings
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    # Check if finding matches the configured global severity level
                    if g.Severity in sca_allowed_warning_level(d):
                        # if all checks passed append the data model object to the local
                        # _findings list
                        _findings.append(g)
                except Exception:
                    pass
    # serialize all findings identified
    sca_add_model_class_list(d, _findings)
    # return a string representation of the serialized list
    return sca_save_model_to_string(d)
```

#### What to do on missing information from the tool

Not all tools offer all the information bits that the internal data model can handle.
To workaround that see the following for ideas how to handle these situations

**Missing severity** - Insert a fixed severity from the possible entries 'error', 'warning' or 'info'

**Missing column** - Don't set `Column` in function call. In the resulting item `Column` will be set to `1`

**Missing line** - Don't set `Line` in function call. In the resulting item `Line` will be set to `1`

**Missing message** - Insert a fixed string

**Missing ID** - This is the most difficult one. One idea is to insert the hash of the `Message` field. Otherwise insert a fixed string.

## Add information to global SCA configuration

As all code is now written, it's time to announce your module to global sca configuration.

This can be either done in your local.conf or your distro.conf file.

Insert the following statements into that file

```bitbake
# This add and activates your module globally
SCA_AVAILABLE_MODULES += "myfoolint"
# This add and activated your module for recipes
# NOTE: you need to set both variables
SCA_ENABLED_MODULES_RECIPE += "myfoolint"

# Optionally you can set a global blacklist entry
# for the tool, if it shouldn't be run on any specific recipe
# e.g. linux-kernel
SCA_BLACKLIST_myfoolint = ""
```

**Congratulation** you made it - Now it's time to test your implementation!

## Contribute it back

Feel free to contribute back your implementation.
