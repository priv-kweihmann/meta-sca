SUMMARY = "NPM: @textlint/utils"
DESCRIPTION = "textlint internal utils."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/utils/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fdf16298bf702d1ba5d61988dfe70c9f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@textlint/utils/-/utils-12.1.0.tgz"
SRC_URI[md5sum] = "9326fa7dd3d8bd27323800cea0bb3680"
SRC_URI[sha256sum] = "94fcc068fe0024b669e5f8b8cf585b7f684c970522eae2e3fe69b2d36e2cbc03"

NPM_PKGNAME = "@textlint/utils"

inherit npmhelper
inherit native
