SUMMARY = "NPM: @textlint/module-interop"
DESCRIPTION = "ECMAScript module interop library"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/module-interop/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fdf16298bf702d1ba5d61988dfe70c9f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@textlint/module-interop/-/module-interop-12.1.0.tgz"
SRC_URI[md5sum] = "244cbc22bc1a23e04adfcc25d49b0fd6"
SRC_URI[sha256sum] = "a27f368843163adc1270e45110fe4fde982e0b5d77e02064fb2412f903ec4e51"

NPM_PKGNAME = "@textlint/module-interop"

inherit npmhelper
inherit native
