SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001168.tgz"
SRC_URI[md5sum] = "5e3a593940a8395ffed86809b72764f7"
SRC_URI[sha256sum] = "211adf966c82df45ac56824bcb711cb06f282fbbfdefb600d36b9bf99f4a2b88"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
