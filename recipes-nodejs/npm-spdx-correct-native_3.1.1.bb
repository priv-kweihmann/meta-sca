SUMMARY = "NPM: spdx-correct"
DESCRIPTION = "correct invalid SPDX expressions"
HOMEPAGE = "https://github.com/jslicense/spdx-correct.js#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = "npm-spdx-expression-parse-native \
           npm-spdx-license-ids-native"

SRC_URI = "https://registry.npmjs.org/spdx-correct/-/spdx-correct-3.1.1.tgz"
SRC_URI[md5sum] = "bd668e9b71960e76e867c11ec3ec2982"
SRC_URI[sha256sum] = "5fdfb05593e31709e10690fa2acc8ca921bf67f36b8e7968b018eabdb19682ef"

NPM_PKGNAME = "spdx-correct"

inherit npmhelper
inherit native
