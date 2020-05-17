SUMMARY = "NPM: lodash"
DESCRIPTION = "Lodash modular utilities."
HOMEPAGE = "https://lodash.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8e2fca844c70b3833d7228885447c026"

SRC_URI = "https://registry.npmjs.org/lodash/-/lodash-4.17.15.tgz"
SRC_URI[md5sum] = "ca95cc62b793243de7b1446a9ee64620"
SRC_URI[sha256sum] = "541c2fe70b322dcaaf2df79e7c6117ca2ca392e9dc15a2cd6c4b3f5cebefcc0d"

S = "${WORKDIR}/package"

NPM_PKGNAME = "lodash"

inherit npmhelper
inherit native
