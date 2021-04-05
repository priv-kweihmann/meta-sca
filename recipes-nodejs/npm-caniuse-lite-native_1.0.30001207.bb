SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001207.tgz"
SRC_URI[md5sum] = "e7055d13c8548ac7262fdb96fa42c476"
SRC_URI[sha256sum] = "419c1d54845ccfb2d21901893de5b0e47d95bae73266479be7a0402c36968dd3"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
