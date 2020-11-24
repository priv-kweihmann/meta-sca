SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001161.tgz"
SRC_URI[md5sum] = "2eb5081402e234400494f69ad994f964"
SRC_URI[sha256sum] = "b8b4c3fe29cb05eaa613613d5b0591c71c3898500998c0b840b8153564496882"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
