SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001171.tgz"
SRC_URI[md5sum] = "18889eb310693e7b7cdde99806a944e9"
SRC_URI[sha256sum] = "6294ee33ae034dfe08f3dbd865806bec071502d755df129c05b0358f689556c9"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
