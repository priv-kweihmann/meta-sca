SUMMARY = "NPM: @secretlint/source-creator"
DESCRIPTION = "Create SecretLintRawSource from content."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/source-creator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-istextorbinary-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/source-creator/-/source-creator-2.2.0.tgz"
SRC_URI[md5sum] = "0727a2ad045b2d0474c019df53b33936"
SRC_URI[sha256sum] = "ddda39b7a794ce6689afd5408fae1416289463ff7dd418b554d8c5f5b3567d44"

NPM_PKGNAME = "@secretlint/source-creator"

inherit npmhelper
inherit native
