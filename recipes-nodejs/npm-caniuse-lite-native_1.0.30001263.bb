SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001263.tgz"
SRC_URI[md5sum] = "9ea8bebb8aea2b6f0369415bbc426def"
SRC_URI[sha256sum] = "6011e1d74f4ade04ce2d22eb90649362d8c0993eb2012e70430332e4f7df93d1"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
