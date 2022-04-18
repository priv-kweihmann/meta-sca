SUMMARY = "NPM: @secretlint/source-creator"
DESCRIPTION = "Create SecretLintRawSource from content."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/source-creator/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-istextorbinary-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/source-creator/-/source-creator-5.2.0.tgz"
SRC_URI[md5sum] = "b88b274178cf8333eca436df2d50ee55"
SRC_URI[sha256sum] = "f1d9ac8a7483ca45d2c483b8c3fd5bd0935aec828485efe642bea3eaa27e14a8"

NPM_PKGNAME = "@secretlint/source-creator"

inherit npmhelper
inherit native
