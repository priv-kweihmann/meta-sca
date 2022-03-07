SUMMARY = "NPM: @secretlint/source-creator"
DESCRIPTION = "Create SecretLintRawSource from content."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/source-creator/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-istextorbinary-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/source-creator/-/source-creator-5.0.1.tgz"
SRC_URI[md5sum] = "c720883702dbd0eeb260608a80fa2c68"
SRC_URI[sha256sum] = "7b92a0297062b576c62c27c279c559ae3991a6c97c82af26847c127bc2cefb3a"

NPM_PKGNAME = "@secretlint/source-creator"

inherit npmhelper
inherit native
