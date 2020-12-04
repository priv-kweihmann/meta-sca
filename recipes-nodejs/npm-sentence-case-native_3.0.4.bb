SUMMARY = "NPM: sentence-case"
DESCRIPTION = "Transform into a lower case with spaces between words, then capitalize the string"
HOMEPAGE = "https://github.com/blakeembrey/change-case/tree/master/packages/sentence-case#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44088ba57cb871a58add36ce51b8de08"

DEPENDS = "npm-no-case-native \
           npm-tslib-native \
           npm-upper-case-first-native"

SRC_URI = "https://registry.npmjs.org/sentence-case/-/sentence-case-3.0.4.tgz"
SRC_URI[md5sum] = "335b77570ac3e8eb305ad6564b987230"
SRC_URI[sha256sum] = "50b89d888bcbc00e1340d6f175e940eb6dc9a47920055ed782096fc90d2216fb"

NPM_PKGNAME = "sentence-case"

inherit npmhelper
inherit native
