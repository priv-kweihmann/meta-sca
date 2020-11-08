SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001156.tgz"
SRC_URI[md5sum] = "02a35fc872564064e77b238655e3e7e6"
SRC_URI[sha256sum] = "29ec49e877ec5fb92a7076288063561a6b7ce2c1ca015ac3686dc01af795f09f"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
