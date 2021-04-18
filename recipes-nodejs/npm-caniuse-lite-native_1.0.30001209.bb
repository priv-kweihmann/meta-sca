SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001209.tgz"
SRC_URI[md5sum] = "9179ef062d9e4c76dcd0b0fb703ce360"
SRC_URI[sha256sum] = "b552bfb820559c41eb72f48a2017c9fa0f7c55f4a1077008230aa9e2e824ba30"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
