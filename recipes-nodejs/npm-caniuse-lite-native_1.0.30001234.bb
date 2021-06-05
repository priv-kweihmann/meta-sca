SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001234.tgz"
SRC_URI[md5sum] = "b956d35d903bd80957db794b321da151"
SRC_URI[sha256sum] = "15ad53cca2b2c029612da88166dab32ef73d392b763c8f3a179bfb34bce10c89"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
