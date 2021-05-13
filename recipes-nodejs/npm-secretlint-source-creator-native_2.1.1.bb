SUMMARY = "NPM: @secretlint/source-creator"
DESCRIPTION = "Create SecretLintRawSource from content."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/source-creator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-istextorbinary-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/source-creator/-/source-creator-2.1.1.tgz"
SRC_URI[md5sum] = "4c7ce689a2cceea9f764bb47b122b653"
SRC_URI[sha256sum] = "5a0c0e5d89515b5eebd548204f3d4988e10cb941facd8a976608dc553a09e33e"

NPM_PKGNAME = "@secretlint/source-creator"

inherit npmhelper
inherit native
