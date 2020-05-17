SUMMARY = "NPM: inquirer"
DESCRIPTION = "A collection of common interactive command line user interfaces."
HOMEPAGE = "https://github.com/SBoudrias/Inquirer.js#readme"

DEPENDS = "npm-ansi-escapes-native npm-chalk-native npm-cli-cursor-native npm-cli-width-native npm-external-editor-native npm-figures-native npm-lodash-native npm-mute-stream-native npm-run-async-native npm-rxjs-native npm-string-width-native npm-strip-ansi-native npm-through-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=77154bcc43a22061ba8ebf11fd558f12"

SRC_URI = "https://registry.npmjs.org/inquirer/-/inquirer-7.1.0.tgz"
SRC_URI[md5sum] = "6c9802f2788b2cc120d4868db3b62451"
SRC_URI[sha256sum] = "c39abe255964ca9524cfaeeae47061c1a4e6f52ed7403b04f64b786360cc2666"

NPM_PKGNAME = "inquirer"

inherit npmhelper
inherit native
