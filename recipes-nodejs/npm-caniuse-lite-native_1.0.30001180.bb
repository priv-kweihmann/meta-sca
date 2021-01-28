SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001180.tgz"
SRC_URI[md5sum] = "66aad7870859a000520f152251a4ad1c"
SRC_URI[sha256sum] = "8e6c6579e5f7a9eb918c5de5c0fdbb4a544f7e8bdba76eced9ddf79e8e951b02"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
