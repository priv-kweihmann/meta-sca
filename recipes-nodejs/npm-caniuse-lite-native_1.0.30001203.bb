SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001203.tgz"
SRC_URI[md5sum] = "fdcbb375fb5706fb90d3dbc393e1417a"
SRC_URI[sha256sum] = "45a2137ebef430245f8f85fcfdbe9bf50c76da628b6c36339c91b8794a94a5cd"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
