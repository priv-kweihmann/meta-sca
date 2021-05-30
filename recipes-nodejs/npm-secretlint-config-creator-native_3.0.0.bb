SUMMARY = "NPM: @secretlint/config-creator"
DESCRIPTION = "Config file creator for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-creator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-creator/-/config-creator-3.0.0.tgz"
SRC_URI[md5sum] = "320810c403d1c61d6ce8acdd63735596"
SRC_URI[sha256sum] = "3f712f4566ef7e4b1122a7d1bb90b71aff9f4584f124d6e9e1cf4c7da8e3c532"

NPM_PKGNAME = "@secretlint/config-creator"

inherit npmhelper
inherit native
