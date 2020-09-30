SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001140.tgz"
SRC_URI[md5sum] = "1c8cf4adc42746ef30c2507c3b2e7274"
SRC_URI[sha256sum] = "dda45dbba1cac87c1a6b137ee65a96eda0222c39ada98eefa12db365f92c8c3b"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
