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

SRC_URI = "https://registry.npmjs.org/inquirer/-/inquirer-7.3.0.tgz"
SRC_URI[md5sum] = "ff48f68f1007c6bca2fab95b69949fa2"
SRC_URI[sha256sum] = "380492f2bc9a674562cfaca1def3899e2cbcb7e9bf8fcb1145352bfc0299fc98"

NPM_PKGNAME = "inquirer"

inherit npmhelper
inherit native
