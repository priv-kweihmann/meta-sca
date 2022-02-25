SUMMARY = "NPM: @textlint/module-interop"
DESCRIPTION = "ECMAScript module interop library"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/module-interop/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fdf16298bf702d1ba5d61988dfe70c9f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@textlint/module-interop/-/module-interop-12.1.1.tgz"
SRC_URI[md5sum] = "7073d7e93b5176e43a1f9dec9bf87d62"
SRC_URI[sha256sum] = "d68eb88e1c043b2d3c8d6a3e85af9a754d7d5a19362b1f7884622041a589b526"

NPM_PKGNAME = "@textlint/module-interop"

inherit npmhelper
inherit native
