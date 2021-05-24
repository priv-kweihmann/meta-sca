SUMMARY = "NPM: fraction.js"
DESCRIPTION = "A rational number library"
HOMEPAGE = "http://www.xarg.org/2014/03/rational-numbers-in-javascript/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c16ed6b50ba08352732580775575796f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/fraction.js/-/fraction.js-4.1.1.tgz"
SRC_URI[md5sum] = "0009df5cf7df68afc8a1c393bf00bcc6"
SRC_URI[sha256sum] = "a79ed496980376a7cca15db354e59e0c4b76f9bd71a3f6913922635475bccbca"

NPM_PKGNAME = "fraction.js"

inherit npmhelper
inherit native
