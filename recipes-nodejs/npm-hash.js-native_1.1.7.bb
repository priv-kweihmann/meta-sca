SUMMARY = "NPM: hash.js"
DESCRIPTION = "Various hash functions that could be run by both browser and node"
HOMEPAGE = "https://github.com/indutny/hash.js"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=27;md5=dad318f18fd3c89e1c15dcf36aebbddf"

DEPENDS = "npm-inherits-native \
           npm-minimalistic-assert-native"

SRC_URI = "https://registry.npmjs.org/hash.js/-/hash.js-1.1.7.tgz"
SRC_URI[md5sum] = "2ea3ad0480c15a59d76468d87d765859"
SRC_URI[sha256sum] = "8eadfe0cbd33052fedb65ed4bf9acfe4645eafaabf877d99e3b1d9d771668ca6"

NPM_PKGNAME = "hash.js"

inherit npmhelper
inherit native
