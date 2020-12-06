SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=04ddc8a943888569f9012c4a420f4b09"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.8.1.tgz"
SRC_URI[md5sum] = "39e4276ac3e64122fea96449e609f855"
SRC_URI[sha256sum] = "43000d2702c9465ceb142516b70698d9d62ffe79b3ed876bc10d18e54964d950"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
