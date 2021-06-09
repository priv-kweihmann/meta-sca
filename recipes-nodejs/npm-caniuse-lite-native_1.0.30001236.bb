SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001236.tgz"
SRC_URI[md5sum] = "181ff0e9cf66256b6af8a1497dfd100d"
SRC_URI[sha256sum] = "8a38eac022c23c072a2e78f968bdf2862cef5c97d70cf9499fdd7482b3a14773"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
