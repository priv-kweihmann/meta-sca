SUMMARY = "NPM: @secretlint/source-creator"
DESCRIPTION = "Create SecretLintRawSource from content."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/source-creator/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-istextorbinary-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/source-creator/-/source-creator-5.1.0.tgz"
SRC_URI[md5sum] = "02682b1524001cb8d929cafd664a594b"
SRC_URI[sha256sum] = "0e2ea2632e455b18f7d3b414bc01714903ba3b1aaf996c6569394a07f7acae29"

NPM_PKGNAME = "@secretlint/source-creator"

inherit npmhelper
inherit native
