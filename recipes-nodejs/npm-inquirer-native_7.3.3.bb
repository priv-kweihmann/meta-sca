SUMMARY = "NPM: inquirer"
DESCRIPTION = "A collection of common interactive command line user interfaces."
HOMEPAGE = "https://github.com/SBoudrias/Inquirer.js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=77154bcc43a22061ba8ebf11fd558f12"

DEPENDS = "npm-ansi-escapes-native \
           npm-chalk-native \
           npm-cli-cursor-native \
           npm-cli-width-native \
           npm-external-editor-native \
           npm-figures-native \
           npm-lodash-native \
           npm-mute-stream-native \
           npm-run-async-native \
           npm-rxjs-native \
           npm-string-width-native \
           npm-strip-ansi-native \
           npm-through-native"

SRC_URI = "https://registry.npmjs.org/inquirer/-/inquirer-7.3.3.tgz"
SRC_URI[md5sum] = "7ba774d9dfc806b3650a4fcc852847ac"
SRC_URI[sha256sum] = "aec5029c979b09fd195842fca46834148a954aeccc387e9c043144a3fee1582b"

NPM_PKGNAME = "inquirer"

inherit npmhelper
inherit native
