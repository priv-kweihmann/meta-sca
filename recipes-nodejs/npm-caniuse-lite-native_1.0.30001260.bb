SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = "npm-nanocolors-native"

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001260.tgz"
SRC_URI[md5sum] = "093180accd642fadb6efb841bc1ddf5e"
SRC_URI[sha256sum] = "676dc6d67311b812f1cdfe44953cbdda5bea284498565d7f9a05f7426ded8f09"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
