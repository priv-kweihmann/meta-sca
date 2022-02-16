SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-17.0.18.tgz"
SRC_URI[md5sum] = "fcc9a191af465c7d7d672e4f926b1fac"
SRC_URI[sha256sum] = "135d4517d6f139634f20cbe433d87351b17d1f9465abc4bdc5dd6d33ccc7498f"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
