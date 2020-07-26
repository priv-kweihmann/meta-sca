SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001106.tgz"
SRC_URI[md5sum] = "7290682a4f78d799b856d599d9355cfd"
SRC_URI[sha256sum] = "d6fb5326a07c1fe3bfb91ae75989b6b7172c1c5d3e7b2bce8d0d63c81bc91bc3"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
