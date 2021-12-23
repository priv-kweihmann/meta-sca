SUMMARY = "NPM: @secretlint/source-creator"
DESCRIPTION = "Create SecretLintRawSource from content."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/source-creator/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-istextorbinary-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/source-creator/-/source-creator-4.1.3.tgz"
SRC_URI[md5sum] = "f30599914a02a6cdaafa790ffe3cb790"
SRC_URI[sha256sum] = "20683d7f03419b5c858288a92645bf362c587064bf5f474f7ff483fc6416e5d6"

NPM_PKGNAME = "@secretlint/source-creator"

inherit npmhelper
inherit native
