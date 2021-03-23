SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001204.tgz"
SRC_URI[md5sum] = "0fbf8707ab6419effa8aa18b36bcfb80"
SRC_URI[sha256sum] = "199a4d09dafad6a8346324be1e35c9337d3544499bb75ffb93e32c66273305bf"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
