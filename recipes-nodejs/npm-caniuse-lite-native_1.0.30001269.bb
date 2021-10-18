SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001269.tgz"
SRC_URI[md5sum] = "cb29bb73e0a4fb4feadea208dd1dfb7d"
SRC_URI[sha256sum] = "ae7dde1bc312459d583318627655ef8871c3ed3ac710b478d1853bf543b0801d"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
