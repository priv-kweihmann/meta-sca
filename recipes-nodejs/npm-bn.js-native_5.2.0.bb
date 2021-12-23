SUMMARY = "NPM: bn.js"
DESCRIPTION = "Big number implementation in pure javascript"
HOMEPAGE = "https://github.com/indutny/bn.js"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dc11970b13299ee35569bc29a78d95b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/bn.js/-/bn.js-5.2.0.tgz"
SRC_URI[md5sum] = "9f2690e5cd10d2ce33074a3521165a08"
SRC_URI[sha256sum] = "9c74c1b2543be752c29f6995414309eca1b5f9599efd041ea0f0f77d2191b2ca"

NPM_PKGNAME = "bn.js"

inherit npmhelper
inherit native
