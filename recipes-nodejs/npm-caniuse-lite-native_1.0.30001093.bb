SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001093.tgz"
SRC_URI[md5sum] = "d51b753be4508e35f8ba2bc1355c1a9a"
SRC_URI[sha256sum] = "916e1de42cd8064e25ed8f1953ff8d0ea07716f97c1053f489258ecd6270643f"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
