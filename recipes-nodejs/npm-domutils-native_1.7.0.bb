SUMMARY = "NPM: domutils"
DESCRIPTION = "utilities for working with htmlparser2's dom"
HOMEPAGE = "https://github.com/FB55/domutils#readme"

DEPENDS = "npm-dom-serializer-native npm-domelementtype-native"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

SRC_URI = "https://registry.npmjs.org/domutils/-/domutils-1.7.0.tgz"
SRC_URI[md5sum] = "203206924b20ea163ba3f7190f7476da"
SRC_URI[sha256sum] = "16c87c6807771ba22aa53cebd8d9700b3db036b1582efb152fdc1af533185f50"

NPM_PKGNAME = "domutils"

inherit npmhelper
inherit native
