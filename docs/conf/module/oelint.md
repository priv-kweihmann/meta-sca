# Configuration for oelint

## Supported environments/languages

* bitbake

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_oelint | Blacklist filter for this tool | space-separated-list | ""
| SCA_OELINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_OELINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [x] run on image
- [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [ ] requires online access

## Known error-ids

* oelint.oelint.comments.notrailing - No trailing comments allowed, comments should be on a single line
* oelint.oelint.file.patchsignedoff - Patches should contain a Signed-Of-By entry
* oelint.oelint.file.upstreamstatus - Patches should contain a Upstream-Status entry
* oelint.oelint.spaces.emptyline - Empty line should not contain spaces or tabs
* oelint.oelint.spaces.linebeginning - No space at a line beginning
* oelint.oelint.spaces.linecont - Safe line continuation
* oelint.oelint.spaces.lineend - No spaces at line end
* oelint.oelint.tabs.notabs - No tabs allowed
* oelint.oelint.task.addnotaskbody - Task added by addtask cannot be found
* oelint.oelint.task.customorder - order of custom tasks added via addtask
* oelint.oelint.task.docstrings - Custom tasks should have docstrings
* oelint.oelint.task.multiappends - Multiple appends to the same function in the same file won't work in bitbake
* oelint.oelint.task.nocopy - No cp usage in do_install
* oelint.oelint.task.nomkdir - No mkdir usage in do_install
* oelint.oelint.task.order - Order of tasks
* oelint.oelint.var.bbclassextend - Use BBCLASSEXTEND when possible
* oelint.oelint.var.licenseremotefile - License shall be a file in remote source not a local file
* oelint.oelint.var.mandatoryvar - Check for mandatory variables
* oelint.oelint.var.multiinclude - Warn on including the same file more than once
* oelint.oelint.var.multiinherit - Warn on inherit the same file more than once
* oelint.oelint.var.nativefilename - Native only recipes should be named -native
* oelint.oelint.var.order - Variable order
* oelint.oelint.var.override - Check if include/append is overriding a variable
* oelint.oelint.var.suggestedvar - Notice on suggested variables
* oelint.oelint.vars.bugtrackerisurl - BUGTRACKER should be an URL
* oelint.oelint.vars.dependsappend - DEPENDS should only be appended, not overwritten
* oelint.oelint.vars.homepageprefix - HOMEPAGE should begin with https:// or http://
* oelint.oelint.vars.multilineident - On a multiline assignment, line indent is desirable
* oelint.oelint.vars.sectionlowercase - SECTION should be lowercase only
* oelint.oelint.vars.spacesassignment - ' = ' should be correct variable assignment
* oelint.oelint.vars.summary80chars - SUMMARY should max. be 80 characters long
* oelint.oelint.vars.summarylinebreaks - No line breaks in SUMMARY
* oelint.oelint.vars.valuequoted - Variable values should be properly quoted

## Checking scope

- [ ] security
- [ ] functional defects
- [x] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error considered as style issue

* oelint.oelint.*
