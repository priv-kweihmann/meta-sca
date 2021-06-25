SUMMARY = "NPM: @secretlint/source-creator"
DESCRIPTION = "Create SecretLintRawSource from content."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/source-creator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-istextorbinary-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/source-creator/-/source-creator-3.1.0.tgz"
SRC_URI[md5sum] = "236d8c583664e90d2ea2da4cc601b0f6"
SRC_URI[sha256sum] = "2ee892be173f521b17a07157bc079b42c5cabdcd1fee357dd7a33aa4bf009c67"

NPM_PKGNAME = "@secretlint/source-creator"

inherit npmhelper
inherit native
