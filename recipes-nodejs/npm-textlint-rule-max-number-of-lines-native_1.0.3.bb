SUMMARY = "NPM: textlint-rule-max-number-of-lines"
DESCRIPTION = "textlint rule for linting number of lines."
HOMEPAGE = "https://github.com/azu/textlint-rule-max-number-of-lines"

DEPENDS = "npm-object-assign-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

SRC_URI = "https://registry.npmjs.org/textlint-rule-max-number-of-lines/-/textlint-rule-max-number-of-lines-1.0.3.tgz"
SRC_URI[md5sum] = "ec90527f33079f8995d8f0f4e566f9a6"
SRC_URI[sha256sum] = "99ed2c1d6581a6d23ab5002153d86d36da06e416ccc49f601b08d1a748885a35"

NPM_PKGNAME = "textlint-rule-max-number-of-lines"

inherit npmhelper
inherit native
