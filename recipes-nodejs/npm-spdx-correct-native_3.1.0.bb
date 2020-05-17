SUMMARY = "NPM: spdx-correct"
DESCRIPTION = "correct invalid SPDX expressions"
HOMEPAGE = "https://github.com/jslicense/spdx-correct.js#readme"

DEPENDS = "npm-spdx-expression-parse-native npm-spdx-license-ids-native"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://registry.npmjs.org/spdx-correct/-/spdx-correct-3.1.0.tgz"
SRC_URI[md5sum] = "9a2e2280586c3be174ba74173c3d81e8"
SRC_URI[sha256sum] = "d14599307416be076cf6301efe3053a5fb16cbbb9d95346eb0429f65fb46164f"

NPM_PKGNAME = "spdx-correct"

inherit npmhelper
inherit native
