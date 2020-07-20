SUMMARY = "NPM: lodash"
DESCRIPTION = "Lodash modular utilities."
HOMEPAGE = "https://lodash.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8e2fca844c70b3833d7228885447c026"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lodash/-/lodash-4.17.19.tgz"
SRC_URI[md5sum] = "22620eb26b71c4204b4179443d216285"
SRC_URI[sha256sum] = "d36e4d3da7ef0b9d6a60d1a9ca49d0acfe2213041b0ad56373176922255e415f"

NPM_PKGNAME = "lodash"

inherit npmhelper
inherit native
