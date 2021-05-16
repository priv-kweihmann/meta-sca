SUMMARY = "NPM: fraction.js"
DESCRIPTION = "A rational number library"
HOMEPAGE = "http://www.xarg.org/2014/03/rational-numbers-in-javascript/"

LICENSE = "MIT | GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c16ed6b50ba08352732580775575796f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/fraction.js/-/fraction.js-4.1.0.tgz"
SRC_URI[md5sum] = "45720290b5d76b29fc34907c08df69b3"
SRC_URI[sha256sum] = "1c351b63993b33d029916d15371864d3ddc29d01f8de8299302b1ce07f1bf411"

NPM_PKGNAME = "fraction.js"

inherit npmhelper
inherit native
