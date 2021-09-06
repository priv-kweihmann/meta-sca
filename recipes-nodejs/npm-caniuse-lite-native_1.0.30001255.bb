SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001255.tgz"
SRC_URI[md5sum] = "5c0b1898ee6db101ef2424f005c7a306"
SRC_URI[sha256sum] = "593fffff2cd69eaac5169046a8f8859d056ab85580933626d5e52e2abeabd73b"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
