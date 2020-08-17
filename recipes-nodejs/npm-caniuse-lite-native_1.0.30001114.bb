SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001114.tgz"
SRC_URI[md5sum] = "a448bbf83fb5eefdc2014e95b59b9b70"
SRC_URI[sha256sum] = "900855f2d99f5b5df7a419e185806035bf8f9e8d78b849e653c69dafd682c251"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
