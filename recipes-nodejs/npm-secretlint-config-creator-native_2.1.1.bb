SUMMARY = "NPM: @secretlint/config-creator"
DESCRIPTION = "Config file creator for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-creator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-creator/-/config-creator-2.1.1.tgz"
SRC_URI[md5sum] = "7305685142ebf516ff19e8aaeff61e3d"
SRC_URI[sha256sum] = "cc24669fd8acfd2361b22546896752457e3cda5beae23fee8ca3b498cca1f9ba"

NPM_PKGNAME = "@secretlint/config-creator"

inherit npmhelper
inherit native
