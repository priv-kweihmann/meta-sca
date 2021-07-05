SUMMARY = "NPM: @secretlint/config-creator"
DESCRIPTION = "Config file creator for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-creator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-creator/-/config-creator-3.3.0.tgz"
SRC_URI[md5sum] = "dc36eac9440924c3f49c1b021f497042"
SRC_URI[sha256sum] = "e659015b35553581547a1d0451048f7973ba1efc4f96f882fadd81f8950b5179"

NPM_PKGNAME = "@secretlint/config-creator"

inherit npmhelper
inherit native
