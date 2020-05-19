SUMMARY = "NPM: dot-case"
DESCRIPTION = "Transform into a lower case string with a period between words"
HOMEPAGE = "https://github.com/blakeembrey/change-case/tree/master/packages/dot-case#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44088ba57cb871a58add36ce51b8de08"

DEPENDS = "npm-no-case-native \
           npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/dot-case/-/dot-case-3.0.3.tgz"
SRC_URI[md5sum] = "a96b298cd9c922538f5be2aa34a8c7cd"
SRC_URI[sha256sum] = "77be70ce7597783296f43c58c5bf6f121fc6db5ca7bbe37f87ac3f2f94d49f28"

NPM_PKGNAME = "dot-case"

inherit npmhelper
inherit native
