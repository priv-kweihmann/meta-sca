# Configuration for pkgqaenc

## Supported environments/languages

* Packages

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_pkgqaenc | Blacklist filter for this tool | space-separated-list | ""
| SCA_PROGPILOT_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_PROGPILOT_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_PKGQAENC_PERM_MAX_MASK | Max. permitted file mode  mask | octal representation | see below
| SCA_PKGQAENC_PERM_MIN_MASK | Min. required file mode  mask | octal representation | see below
| SCA_PKGQAENC_ACCEPTABLE_DIRS | Directories where packages could install data | space-separated-list | see sca-pkgqaenc.bbclass
| SCA_PKGQAENC_BLACKLIST_DIRS | Directories where no files should be installed | space-separated-list | \${infodir} \${docdir} \${mandir}
| SCA_PKGQAENC_ACCEPTABLE_SHEBANG | Accepted shebangs in script files | space-separated-list | ""
| SCA_PKGQAENC_BLACKLIST_SHEBANG | Blacklisted shebangs in script files | space-separated-list | ""
| SCA_PKGQAENC_BLACKLIST_FILES | Files that shouldn't be installed | space-separated-list | ".c .h .cpp .hpp .man" for base, "application/x-executable application/x-sharedlib application/x-pie-executable" for -dev
| SCA_PKGQAENC_WHITELIST_FILES | Files that are okay to be installed | space-separated-list | ""

### Package based rules

Each of the configuration could be suffixed by a package name.
So `SCA_PKGQAENC_PERM_MAX_MASK` applies to the __base__ package, while `SCA_PKGQAENC_PERM_MAX_MASK-dev` applies to the 
__dev__ package.

### Fallback setting

The configuration for `SCA_PKGQAENC_PERM_MAX_MASK`, `SCA_PKGQAENC_PERM_MIN_MASK` and `SCA_PKGQAENC_BLACKLIST_FILES` can contain 
the keys

* `default` for all files, that are not catched by more specific rules
* `script` for all files, that have been identified as scripts (they do contain a shebang entry)
* `dir` for all directories

### File matching

The configuration for `SCA_PKGQAENC_PERM_MAX_MASK`, `SCA_PKGQAENC_PERM_MIN_MASK` and `SCA_PKGQAENC_BLACKLIST_FILES` can contain either

* a file extension (with the leading dot)
* a mime type (like you would see when running `mimetype <file>`)
* a filename

The tool determines in the following order

* file extension -> specific rule (doesn't apply to directories)
* mime type -> specfic rule
* if detected as a script -> `script` rule (doesn't apply to directories)
* if detected as a directory -> `dir` rule
* if `default` is configured -> `default` rule

### Applied standard configuration

```bitbake
SCA_PKGQAENC_PERM_MAX_MASK[default] ?= "0644"
SCA_PKGQAENC_PERM_MAX_MASK[application_x-executable] ?= "0755"
SCA_PKGQAENC_PERM_MAX_MASK[application_x-pie-executable] ?= "0755"
SCA_PKGQAENC_PERM_MAX_MASK[application_x-sh] ?= "0755"
SCA_PKGQAENC_PERM_MAX_MASK[application_x-shellscript] ?= "0755"
SCA_PKGQAENC_PERM_MAX_MASK[script] ?= "0755"
SCA_PKGQAENC_PERM_MIN_MASK[default] ?= "0400"
SCA_PKGQAENC_ACCEPTABLE_DIRS ?= "\
                                ${bindir} \
                                ${datadir} \
                                ${infodir} \
                                ${libdir} \
                                ${libexecdir} \
                                ${localstatedir} \
                                ${nonarch_base_libdir} \
                                ${sbindir} \
                                ${servicedir} \
                                ${sharedstatedir} \
                                ${sysconfdir} \
                                ${systemd_system_unitdir} \
                                ${systemd_unitdir} \
                                ${systemd_user_unitdir} \
                                bin \
                                "
SCA_PKGQAENC_BLACKLIST_DIRS ?= "\
                                ${infodir} \
                                ${mandir} \
                                ${docdir} \
                                "
SCA_PKGQAENC_BLACKLIST_FILES ?= "\
                                .c \
                                .cpp \
                                .h \
                                .hpp \
                                .man \
                                "

SCA_PKGQAENC_BLACKLIST_FILES-dev ?= "\
                                    application/x-executable \
                                    application/x-sharedlib \
                                    application/x-pie-executable \
                                    "
```

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

* pkgqaenc.pkgqaenc.too-permissive - File mode bits are too permissive
* pkgqaenc.pkgqaenc.too-restrictive - File mode bits are too restrictive
* pkgqaenc.pkgqaenc.blacklisted-file - File is blacklisted
* pkgqaenc.pkgqaenc.blacklist-dir - Directory is blacklisted
* pkgqaenc.pkgqaenc.acceptableDirs - Directory is non-standard

## Checking scope

* [x] security
* [ ] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* pkgqaenc.pkgqaenc.*

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
