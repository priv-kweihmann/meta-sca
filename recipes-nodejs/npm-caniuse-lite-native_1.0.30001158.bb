SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001158.tgz"
SRC_URI[md5sum] = "2ef5b3b8393a1d1975def7afc151dd07"
SRC_URI[sha256sum] = "d41b88aaf06951265651ab5b9c97f6cb5c7ff98f1dc9afd20f602e6383a2b8bf"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
