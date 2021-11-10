SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001279.tgz"
SRC_URI[md5sum] = "c4259cfd82830794fbcb674f1a4ec57e"
SRC_URI[sha256sum] = "0f2ab42d2e1b91b2efb3c85f8826f557c384258e1878ce6509bb6c262079538d"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
