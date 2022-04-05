SUMMARY = "NPM: @secretlint/config-creator"
DESCRIPTION = "Config file creator for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-creator/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-creator/-/config-creator-5.1.3.tgz"
SRC_URI[md5sum] = "b116c5c6c658a9fb83ad90c761c6e464"
SRC_URI[sha256sum] = "798c8cad3eb4b680a0fc24b10e7a223de8b1f340b59c2b4d723d715942c63729"

NPM_PKGNAME = "@secretlint/config-creator"

inherit npmhelper
inherit native
