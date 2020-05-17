SUMMARY = "NPM: is-symbol"
DESCRIPTION = "Determine if a value is an ES6 Symbol or not."
HOMEPAGE = "https://github.com/inspect-js/is-symbol#readme"

DEPENDS = "npm-has-symbols-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

SRC_URI = "https://registry.npmjs.org/is-symbol/-/is-symbol-1.0.3.tgz"
SRC_URI[md5sum] = "06dcf71bf3042960992b2a01e69be45c"
SRC_URI[sha256sum] = "08ad22249c0a5dece157e86d206bf7a138cc49670464a3abb9dd89e28cebfa4d"

NPM_PKGNAME = "is-symbol"

inherit npmhelper
inherit native
