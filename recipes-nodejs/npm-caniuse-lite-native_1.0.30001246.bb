SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001246.tgz"
SRC_URI[md5sum] = "e244e882876a99a3a3f02f7b1ff1ba4c"
SRC_URI[sha256sum] = "8898ebd3d713ef34826d0b2d505374e3f918e97e6f91b9016d8bd882e8113b53"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
