SUMMARY = "NPM: foreach"
DESCRIPTION = "foreach component + npm package"
HOMEPAGE = "https://github.com/manuelstofer/foreach"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b2225091caf5effa363ef7016fa2b0ba"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/foreach/-/foreach-2.0.5.tgz"
SRC_URI[md5sum] = "2c1fcb44ee661bdeca98cdcdecbbf6fd"
SRC_URI[sha256sum] = "93296ba4b487e34a30935f4a833152b2c7a85f6779040a791080e60a6d1f3e17"

NPM_PKGNAME = "foreach"

inherit npmhelper
inherit native
