SUMMARY = "NPM: async"
DESCRIPTION = "Higher-order functions and common patterns for asynchronous code"
HOMEPAGE = "https://caolan.github.io/async/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f63c1fa4541b2f2f34d77140ebe89d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/async/-/async-3.2.2.tgz"
SRC_URI[md5sum] = "e1ef9ce4c750b47235cb9aa39c17cf4a"
SRC_URI[sha256sum] = "76fe37d17a8e73cc01643f17c97e5197e008baec177043ef30c837faec81b4cc"

NPM_PKGNAME = "async"

inherit npmhelper
inherit native
