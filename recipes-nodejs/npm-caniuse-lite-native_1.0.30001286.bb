SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001286.tgz"
SRC_URI[md5sum] = "fdd905fdf7b812d1d4ae366082c20ad5"
SRC_URI[sha256sum] = "b5e99b90a9356d71c2985c42db03ae0bedb51a208fd5f6c38c66770a55d14c3e"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
