SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001265.tgz"
SRC_URI[md5sum] = "a62e0203bb33e2e020ce32fe3875ba7b"
SRC_URI[sha256sum] = "b6fe4a21a6d697e726e61a18a2c3c00a4731ae34568cdc7d5a01401926318a50"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
