SUMMARY = "NPM: @azu/format-text"
DESCRIPTION = "String formatting library inspired from Python"
HOMEPAGE = "https://github.com/azu/format-text#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI = "https://registry.npmjs.org/@azu/format-text/-/format-text-1.0.1.tgz"
SRC_URI[md5sum] = "73c6e36bd07a0ef32924eb27a6defc3f"
SRC_URI[sha256sum] = "ec24e109265b8b57b2e7240cc14f8cfec556103c38fce9f6066191c359fdb96c"

NPM_PKGNAME = "@azu/format-text"

inherit npmhelper
inherit native
