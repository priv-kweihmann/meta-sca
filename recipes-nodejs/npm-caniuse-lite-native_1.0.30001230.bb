SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001230.tgz"
SRC_URI[md5sum] = "e8fae1a64440c357bf2736a856a128e1"
SRC_URI[sha256sum] = "82a8f226224078e569fb722c736f7d6afe522c12f230e97eb71826541aa642ac"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
