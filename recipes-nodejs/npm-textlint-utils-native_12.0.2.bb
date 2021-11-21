SUMMARY = "NPM: @textlint/utils"
DESCRIPTION = "textlint internal utils."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/utils/"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fdf16298bf702d1ba5d61988dfe70c9f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@textlint/utils/-/utils-12.0.2.tgz"
SRC_URI[md5sum] = "a436e69daffcf2b0c09aab44cbc47351"
SRC_URI[sha256sum] = "ba40e7e0dc2f0afc6b4bfca8fb24b132538bbeea918e21f3083bc5095f76644b"

NPM_PKGNAME = "@textlint/utils"

inherit npmhelper
inherit native
