SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001241.tgz"
SRC_URI[md5sum] = "99b1466b501dcc8b9928f050efad26b5"
SRC_URI[sha256sum] = "0178e953f127a36f4341890717d44c593db5fa8e09344628f412a7a25719cf8f"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
