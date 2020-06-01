SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001066.tgz"
SRC_URI[md5sum] = "b493a26998e03189b11a72765f273fac"
SRC_URI[sha256sum] = "9bb4ec86f1720bd0aebc2f27169c9956f893d64e4d3b7f71529fcaa87a661ef7"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
