SUMMARY = "NPM: @secretlint/config-creator"
DESCRIPTION = "Config file creator for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-creator/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-creator/-/config-creator-4.2.0.tgz"
SRC_URI[md5sum] = "19d75c2df929faf08ee345ea04a98a6c"
SRC_URI[sha256sum] = "34a8e0b28bc62074c77d365e8ec24f4f56a546cab244f1fe0725f3a6608f2da1"

NPM_PKGNAME = "@secretlint/config-creator"

inherit npmhelper
inherit native
