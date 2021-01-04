SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001173.tgz"
SRC_URI[md5sum] = "f875aa9d9a71bb5fb81290bfaf2a1581"
SRC_URI[sha256sum] = "f0b4dbde524e9e9bcca9a1aca68517f73a2818e0026658269cd482a505cd646d"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
