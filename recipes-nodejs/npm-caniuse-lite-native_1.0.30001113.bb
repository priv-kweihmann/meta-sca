SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001113.tgz"
SRC_URI[md5sum] = "76555c5eab61a6c804f5fa317eb832ba"
SRC_URI[sha256sum] = "276cc26707e37f8187b3486ec61bdd03787cefa76bd507becf03af7017ca29bf"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
