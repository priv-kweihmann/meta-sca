SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001077.tgz"
SRC_URI[md5sum] = "78ed7a2c0ad05ddbb003c7eecc37bd5d"
SRC_URI[sha256sum] = "4fafdcc7ed9086fa6f6ac6ebf341b1b1e332c7b55189a9b48993a843d5d9053d"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
