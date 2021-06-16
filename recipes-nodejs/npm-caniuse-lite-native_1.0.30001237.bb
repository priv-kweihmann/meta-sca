SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001237.tgz"
SRC_URI[md5sum] = "90081963bc792ae7281cec0259c7355c"
SRC_URI[sha256sum] = "c05ee8e773e0e5b18c10a926d6137d45499af95ecee82d1de87b62520f73bccb"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
