SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001287.tgz"
SRC_URI[md5sum] = "0825250180230dd032d0b75daddbced2"
SRC_URI[sha256sum] = "688b079d3e6726c77b9a615270229369c67f173dfd8bf98a858ff7b9d19f978a"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
