SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001117.tgz"
SRC_URI[md5sum] = "215c4f1e503219d305fc661251ed522f"
SRC_URI[sha256sum] = "bdd24a7479621610f6e13c3da4b3effa3f317a69cec1dfe0e11640962a67f9bb"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
