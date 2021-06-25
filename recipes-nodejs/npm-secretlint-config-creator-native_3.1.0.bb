SUMMARY = "NPM: @secretlint/config-creator"
DESCRIPTION = "Config file creator for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-creator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-creator/-/config-creator-3.1.0.tgz"
SRC_URI[md5sum] = "34a3ff3073accbec71f6f0c9c2ecc370"
SRC_URI[sha256sum] = "b9d6ffb141e638210b29972e9b3ef971faf895cb5b2180c7075ba8ddd97bf929"

NPM_PKGNAME = "@secretlint/config-creator"

inherit npmhelper
inherit native
