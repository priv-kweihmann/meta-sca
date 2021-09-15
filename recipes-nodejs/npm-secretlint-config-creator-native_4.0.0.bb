SUMMARY = "NPM: @secretlint/config-creator"
DESCRIPTION = "Config file creator for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-creator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-creator/-/config-creator-4.0.0.tgz"
SRC_URI[md5sum] = "372b5eff983a633ad3069c475ca5df96"
SRC_URI[sha256sum] = "f91acb1b8e2406607cc483e329926a2cc553da7a67d735d6a05d98f638dbfbc2"

NPM_PKGNAME = "@secretlint/config-creator"

inherit npmhelper
inherit native
