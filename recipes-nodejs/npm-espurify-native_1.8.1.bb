SUMMARY = "NPM: espurify"
DESCRIPTION = "Clone new AST without extra properties"
HOMEPAGE = "https://github.com/estools/espurify"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=645aacf0c44ee7ffd493fa45c3cdffda"

DEPENDS = "npm-core-js-native"

SRC_URI = "https://registry.npmjs.org/espurify/-/espurify-1.8.1.tgz"
SRC_URI[md5sum] = "95d0ab2ab66f75ef55dc80deb97b8dee"
SRC_URI[sha256sum] = "9e964252e970975f0c3a09417b6cfad710d4c44d6220e40a9ade7bdb4ee26552"

NPM_PKGNAME = "espurify"

inherit npmhelper
inherit native
