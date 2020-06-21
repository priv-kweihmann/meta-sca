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

SRC_URI = "https://registry.npmjs.org/inquirer/-/inquirer-7.2.0.tgz"
SRC_URI[md5sum] = "87f5b22b8993515d959246e438c02062"
SRC_URI[sha256sum] = "7d409546e9a8fe327c5a9c31d6d06d88ff71e233e1c3ccfe65a9af3d57337b7e"

NPM_PKGNAME = "inquirer"

inherit npmhelper
inherit native
