SUMMARY = "NPM: @secretlint/source-creator"
DESCRIPTION = "Create SecretLintRawSource from content."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/source-creator/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-istextorbinary-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/source-creator/-/source-creator-4.2.0.tgz"
SRC_URI[md5sum] = "d27417d344a2179f9e2d02e8bb671e99"
SRC_URI[sha256sum] = "7e9b1e94f058b063e881ab527dfb896f14cfec1c77ed2f5fcc50b7b059942091"

NPM_PKGNAME = "@secretlint/source-creator"

inherit npmhelper
inherit native
