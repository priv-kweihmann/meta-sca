SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001119.tgz"
SRC_URI[md5sum] = "c412aff8aeab7ced3d586f3c700aacee"
SRC_URI[sha256sum] = "b2dc26496c68b948a86015a2665b11c1d2ceca0727e07fa14a94680f9382f4b8"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
