SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001137.tgz"
SRC_URI[md5sum] = "63bb0f4a997f0aa8eb288f2e3fbd6904"
SRC_URI[sha256sum] = "27134de8b8aa6ca863222d8bd4fbca1df2932508f5ded22aff99d97db406844a"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
