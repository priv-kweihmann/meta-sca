SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001242.tgz"
SRC_URI[md5sum] = "717f31fe5a63b2e57ff7d00f1a2a0256"
SRC_URI[sha256sum] = "24f493949f8675a3aa2d3ab3fcd1e291bad0a35d9bf358e912bd2790982d67b5"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
