# Configuration for systemdlint

## Supported environments/languages

* systemd

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[systemdlint] | Blacklist filter for this tool | space-separated-list | ""
| SCA_SYSTEMDLINT_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_SYSTEMDLINT_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_SYSTEMDLINT_SYSTEMD_VERSION | Specifies the version of systemd to be checked against. Leave empty to disable | version string | ""
| SCA_SYSTEMDLINT_FILES | File extensions to check on | space-separated-list | ".automount .conf .link .mount .network .path .service .slice .socket .swap .target .timer"
| SCA_SYSTEMDLINT_PATHS | Paths to search for systemd-files | space-separated-list | \${SCA_SOURCES_DIR}/\${sysconfdir}/systemd \${SCA_SOURCES_DIR}/\${libdir}/systemd \${SCA_SOURCES_DIR}/run/systemd

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [x] run on image
* [x] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

* systemdlint.systemdlint.ConflictingOptions - The set option somehow is in conflict with another unit
* systemdlint.systemdlint.ExecNotFound - The referenced executable was not found on system
* systemdlint.systemdlint.FullPrivileges - An executable is run with full privileges
* systemdlint.systemdlint.InvalidNumericBase - A numeric value doesn't match because it needs to be a multiple of X
* systemdlint.systemdlint.InvalidSetting - The option doesn't match the section
* systemdlint.systemdlint.InvalidValue - An invalid value is set
* systemdlint.systemdlint.MandatoryOptionMissing - A mandatory option was missing in the file
* systemdlint.systemdlint.Multiplicity - The option is not valid for the given amount of options in this context
* systemdlint.systemdlint.NoExecutable - The referenced executable is NOT executable
* systemdlint.systemdlint.NoFailureCheck - An executable is run without checking for failures
* systemdlint.systemdlint.OptionDeprecated - The used option is not available anymore in this version
* systemdlint.systemdlint.OptionTooNew - The used option will be available in a later version than used
* systemdlint.systemdlint.ReferencedUnitNotFound - The unit referenced was not found in system
* systemdlint.systemdlint.SettingRequires - The option requires another option to be set
* systemdlint.systemdlint.SettingRestricted - The option can't be set due to another option
* systemdlint.systemdlint.SyntaxError - The file is not parseable
* systemdlint.systemdlint.UnitSectionMissing - The Unit-section is missing in the file
* systemdlint.systemdlint.UnknownUnitType - The file extension of the file is not a known systemd one
* systemdlint.systemdlint.WrongFileMask - The file has a risky filemode set

## Checking scope

* [x] security
* [x] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* systemdlint.systemdlint.FullPrivileges
* systemdlint.systemdlint.WrongFileMask

### Error considered as functional defect

* systemdlint.systemdlint.InvalidNumericBase
* systemdlint.systemdlint.InvalidSetting
* systemdlint.systemdlint.InvalidValue
* systemdlint.systemdlint.MandatoryOptionMissing
* systemdlint.systemdlint.NoExecutable
* systemdlint.systemdlint.OptionDeprecated
* systemdlint.systemdlint.OptionTooNew
* systemdlint.systemdlint.ReferencedUnitNotFound
* systemdlint.systemdlint.SettingRequires
* systemdlint.systemdlint.SettingRestricted
* systemdlint.systemdlint.SyntaxError
* systemdlint.systemdlint.UnitSectionMissing
* systemdlint.systemdlint.UnknownUnitType
* systemdlint.systemdlint.ExecNotFound

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* systemdlint.systemdlint.*
