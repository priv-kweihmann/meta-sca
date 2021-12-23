SUMMARY = "NPM: to-regex"
DESCRIPTION = "Generate a regex from a string or array of strings."
HOMEPAGE = "https://github.com/jonschlinkert/to-regex"

DEPENDS = "npm-define-property-native npm-extend-shallow-native npm-regex-not-native npm-safe-regex-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=01a8b0026a66c0139b0434fba078fa92"

SRC_URI = "https://registry.npmjs.org/to-regex/-/to-regex-3.0.2.tgz"
SRC_URI[md5sum] = "8a6359bf8c570483aad2a767191e87bb"
SRC_URI[sha256sum] = "86831805bd821f826f2c77fe1add74855b63801c95a52f41f032cbe73112340d"

NPM_PKGNAME = "to-regex"

inherit npmhelper
inherit native
