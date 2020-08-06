SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001111.tgz"
SRC_URI[md5sum] = "74604b2244088a948051422affb22f2c"
SRC_URI[sha256sum] = "050edd219f2fa75cb4b1932deabeecb66e502c7880e56d5d644d56f981ea27b6"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
