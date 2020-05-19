SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001062.tgz"
SRC_URI[md5sum] = "8b74ff18f350182b62aa9c324e5a7a8d"
SRC_URI[sha256sum] = "08d55f981af2187f851ff53fc408639d3a70b5af5f831bbf3e302107a229c9d1"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
