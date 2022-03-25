SUMMARY = "NPM: @secretlint/source-creator"
DESCRIPTION = "Create SecretLintRawSource from content."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/source-creator/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-istextorbinary-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/source-creator/-/source-creator-5.1.1.tgz"
SRC_URI[md5sum] = "78b05a5daca11771c62a1de1e710295b"
SRC_URI[sha256sum] = "f9125026f4ad5f7b036302aa92074381e6da290dde59c5141f719aad7f76bb64"

NPM_PKGNAME = "@secretlint/source-creator"

inherit npmhelper
inherit native
