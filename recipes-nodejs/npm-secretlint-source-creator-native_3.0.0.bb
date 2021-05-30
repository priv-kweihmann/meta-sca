SUMMARY = "NPM: @secretlint/source-creator"
DESCRIPTION = "Create SecretLintRawSource from content."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/source-creator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-istextorbinary-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/source-creator/-/source-creator-3.0.0.tgz"
SRC_URI[md5sum] = "7cfbeb23666660591bcfa25b7a82c00e"
SRC_URI[sha256sum] = "b1a054d42a49a99196c29f58a82e6753b6fb1004e2b130f41f17a032cbf16e83"

NPM_PKGNAME = "@secretlint/source-creator"

inherit npmhelper
inherit native
