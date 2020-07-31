SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001109.tgz"
SRC_URI[md5sum] = "83787f6c241c0564c39a074160534c92"
SRC_URI[sha256sum] = "510624356b169ee7d98de9d8695ea4a62156d5aad884f37211838cfb172d7ade"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
