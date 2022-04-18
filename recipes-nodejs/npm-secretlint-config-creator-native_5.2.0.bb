SUMMARY = "NPM: @secretlint/config-creator"
DESCRIPTION = "Config file creator for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-creator/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-creator/-/config-creator-5.2.0.tgz"
SRC_URI[md5sum] = "1a25a5c119c0917de5a6dbb9f045952a"
SRC_URI[sha256sum] = "d934d71342d35ecb10b97f7e5164c090878ddc54fc7cc43314e042a27bd25765"

NPM_PKGNAME = "@secretlint/config-creator"

inherit npmhelper
inherit native
