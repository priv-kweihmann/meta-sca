SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001118.tgz"
SRC_URI[md5sum] = "0c7ad6dbf6adf1a8b610479a4897ffaa"
SRC_URI[sha256sum] = "cf47fc7193fb0a70f7e6a4a3cea67e7d243baee86535921603aeb85e664dfa2b"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
