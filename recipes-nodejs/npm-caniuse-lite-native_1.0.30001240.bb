SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001240.tgz"
SRC_URI[md5sum] = "a163c9b2b273faf78c00a6f9035fb666"
SRC_URI[sha256sum] = "e31867ee7b6f6aade328f1b3ea9143aca5b0ef365adaa12f6926b2c023738681"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
