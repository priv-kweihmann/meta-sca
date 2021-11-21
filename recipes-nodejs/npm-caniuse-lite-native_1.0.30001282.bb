SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001282.tgz"
SRC_URI[md5sum] = "ee670635823a3045b9afc6142ca48ddd"
SRC_URI[sha256sum] = "5016d4e8f1ee8c3c3e0b77bae994b7a7e780fe333dfb207f1505d2b88ac22fd8"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
