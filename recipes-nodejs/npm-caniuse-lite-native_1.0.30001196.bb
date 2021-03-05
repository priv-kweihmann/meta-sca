SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001196.tgz"
SRC_URI[md5sum] = "7cd38ae37fa7dac0e8d500ed307a2efc"
SRC_URI[sha256sum] = "8b6a2d188f13f1f2df98cb3869e764c2d84609918c48b8d9ac67ea35ec45f603"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
