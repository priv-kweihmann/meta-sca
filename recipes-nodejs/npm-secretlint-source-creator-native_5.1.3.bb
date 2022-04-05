SUMMARY = "NPM: @secretlint/source-creator"
DESCRIPTION = "Create SecretLintRawSource from content."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/source-creator/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-istextorbinary-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/source-creator/-/source-creator-5.1.3.tgz"
SRC_URI[md5sum] = "ee4fbf63254a1388bb6ec5b957e1a7ce"
SRC_URI[sha256sum] = "85e1c6b89e180ab21b29360e9c0db3eb64d0af6ed905911f59be4062f81ab5b2"

NPM_PKGNAME = "@secretlint/source-creator"

inherit npmhelper
inherit native
