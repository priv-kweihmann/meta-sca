SUMMARY = "NPM: @secretlint/source-creator"
DESCRIPTION = "Create SecretLintRawSource from content."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/source-creator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-istextorbinary-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/source-creator/-/source-creator-3.3.0.tgz"
SRC_URI[md5sum] = "963cf5a987c1b5c7d37c822e6da4f397"
SRC_URI[sha256sum] = "85a5ea62abf75813e8332297a496031e412d15515278fb01ad03723cd4ecef31"

NPM_PKGNAME = "@secretlint/source-creator"

inherit npmhelper
inherit native
