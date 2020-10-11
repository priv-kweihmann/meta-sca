SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001147.tgz"
SRC_URI[md5sum] = "26f0325bd809a60b4fa0d62adad92580"
SRC_URI[sha256sum] = "61105ae5d5e65fb9c4d430659624ef6d5b37ec699c0146ba27842f215d41fc72"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
