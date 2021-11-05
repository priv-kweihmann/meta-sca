SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001278.tgz"
SRC_URI[md5sum] = "c56a9df63b7822cbf1e3d30d2ed46bc9"
SRC_URI[sha256sum] = "742bd5fba84bbeb985f2c287d8dcb3b775d56b116e43ef9f85b1efec20cb9764"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
