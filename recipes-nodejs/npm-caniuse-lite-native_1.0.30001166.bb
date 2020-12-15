SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001166.tgz"
SRC_URI[md5sum] = "5241f655cb6bc68712d13cd5656dc2ee"
SRC_URI[sha256sum] = "dff79bb5dcb980392acc627c11619adcd66e8dd113a5e03520ef1927db866909"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
