SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001183.tgz"
SRC_URI[md5sum] = "183e2296119291926feb26e5889a769a"
SRC_URI[sha256sum] = "62c0f04c68b15468ffabd5dfc8600ff17774c05411d81d7cd70019a5b90b6ad5"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
