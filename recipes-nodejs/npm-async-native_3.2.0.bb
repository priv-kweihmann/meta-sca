SUMMARY = "NPM: async"
DESCRIPTION = "Higher-order functions and common patterns for asynchronous code"
HOMEPAGE = "https://caolan.github.io/async/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f63c1fa4541b2f2f34d77140ebe89d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/async/-/async-3.2.0.tgz"
SRC_URI[md5sum] = "477392a0de7152677c90ab879be39416"
SRC_URI[sha256sum] = "77d8e1dfe991f4b4ff2eb955cfcbd57082d333bdb6b5b96f0e94e1b8cc106771"

NPM_PKGNAME = "async"

inherit npmhelper
inherit native
