SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001223.tgz"
SRC_URI[md5sum] = "d81f5e2641ebded332e8ac25485210d1"
SRC_URI[sha256sum] = "18d33ae55ef57fdf0dd4082e11f95afb4cee0912ccefb8ccaa8c5caebe626f2e"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
