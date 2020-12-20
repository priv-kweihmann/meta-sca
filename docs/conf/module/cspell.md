# Configuration for cspell

This module is someway different in configuration.
First of all this module does not support suppression or fatal-errors, as the only thing, this module
produces is to warn you about typos and unknown words.
The check itself is done for each configured language - meaning a defined set of dictionaries is used for checking.

## Supported environments/languages

* spelling

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_cspell | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_CSPELL_CHECK_LANG | List of languages configured | space-separated-list | "CPP HTML PYTHON TXT"
| SCA_CSPELL_LANG_CPP_files | Files to check for CPP | space-separated-list | ".c .cpp .h .hpp"
| SCA_CSPELL_LANG_HTML_files | Files to check for HTML | space-separated-list | ".html .htm .js"
| SCA_CSPELL_LANG_PYTHON_files | Files to check for PYTHON | space-separated-list | ".py"
| SCA_CSPELL_LANG_PYTHON_shebang | Files to check for PYTHON | space-separated-list | ".*python"
| SCA_CSPELL_LANG_TXT_files | Files to check for TXT | space-separated-list | ".txt .md .rst"

## Add custom words to supported dictionaries

To add a custom word to the dictionary
create a recipe called **cspell-user-dict-native_%.bbappend** in your layer
In this recipe insert the following function

```bitbake
do_compile_append() {
  echo "<your word for the dict>" >> "${WORKDIR}/spell_user.txt"
}
```

## Supports

* [ ] suppression of IDs
* [ ] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Detailed configuration

* **SCA_CSPELL_LANG_\<LANG_CODE\>_files** - List of file extensions to check
* **SCA_CSPELL_LANG_\<LANG_CODE\>_shebang** - Regular expression for getting file by shebang

## Notes

By the default this module does only generate warnings of level **"info"**.
So if you like them to be deployed you have to set **SCA_WARNING_LEVEL** to __"info"__ globally or in the recipe.

## Known error-IDs

__tbd__

## Checking scope

* [ ] security
* [ ] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Execution Speed
* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* cspell.cspell.*
