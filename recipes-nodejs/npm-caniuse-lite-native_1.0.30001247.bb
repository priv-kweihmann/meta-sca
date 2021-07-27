SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001247.tgz"
SRC_URI[md5sum] = "c157002079d076646c66d7c40ee07594"
SRC_URI[sha256sum] = "7cbff7fe3c7c87a6552d27859e5ee6e1c04a731d5a37c2b8cfe11787afb26542"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
