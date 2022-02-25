SUMMARY = "NPM: @textlint/utils"
DESCRIPTION = "textlint internal utils."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/utils/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fdf16298bf702d1ba5d61988dfe70c9f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@textlint/utils/-/utils-12.1.1.tgz"
SRC_URI[md5sum] = "d583759278fe4befea81a0e773de30c0"
SRC_URI[sha256sum] = "58ff2777ad6f5e110578f5e17e330231d791af9a260960c42fe349141da09409"

NPM_PKGNAME = "@textlint/utils"

inherit npmhelper
inherit native
