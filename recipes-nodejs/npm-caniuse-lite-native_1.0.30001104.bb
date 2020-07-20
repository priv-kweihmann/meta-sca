SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001104.tgz"
SRC_URI[md5sum] = "5ee8bde4d70badc79d4e72552c4ca035"
SRC_URI[sha256sum] = "7541906a14422373b7b2ea745d90324be573059f42245128dd96ea8c9a8a55ad"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
