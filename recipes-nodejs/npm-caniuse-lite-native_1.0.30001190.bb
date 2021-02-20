SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001190.tgz"
SRC_URI[md5sum] = "6d065943d4d664a1a1520fc88ab048c2"
SRC_URI[sha256sum] = "3dea67601609b0b32ce3787958723b95ea726f46e34ba166098425641f470bf4"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
