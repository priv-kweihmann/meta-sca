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

SRC_URI = "https://registry.npmjs.org/inquirer/-/inquirer-7.3.2.tgz"
SRC_URI[md5sum] = "8b4c1d2c7877aa8f9917fe4fd4193800"
SRC_URI[sha256sum] = "468298d3bb8f807fb1129b88b645db424104406d44c80166138b5a0fa8d54859"

NPM_PKGNAME = "inquirer"

inherit npmhelper
inherit native
