SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001274.tgz"
SRC_URI[md5sum] = "a76dcf85797c3e1324ff8219b3a36b79"
SRC_URI[sha256sum] = "e6447aa8441bdf90a1e91e5d34dc5908cc9e079208ab4833f7bd8bcbfd99f60a"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
