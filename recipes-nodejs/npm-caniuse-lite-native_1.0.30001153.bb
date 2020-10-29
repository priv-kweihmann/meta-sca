SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001153.tgz"
SRC_URI[md5sum] = "7ba767b3e433cc73a9d650c694d298bf"
SRC_URI[sha256sum] = "a14c5ef34cef11fda71f44db2adbb00b8bc27e961fb697a44925a15b3b17b344"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
