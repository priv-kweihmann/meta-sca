SUMMARY = "NPM: @textlint/module-interop"
DESCRIPTION = "ECMAScript module interop library"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/module-interop/"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fdf16298bf702d1ba5d61988dfe70c9f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@textlint/module-interop/-/module-interop-12.0.2.tgz"
SRC_URI[md5sum] = "62137a641706f270f5320b6eda4a9f10"
SRC_URI[sha256sum] = "de93a1fcefca751bdae8fb59a5c42bea9a8e6869ec0b1bcee7368b9fe65cb71b"

NPM_PKGNAME = "@textlint/module-interop"

inherit npmhelper
inherit native
