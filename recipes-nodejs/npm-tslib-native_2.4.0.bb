SUMMARY = "NPM: tslib"
DESCRIPTION = "Runtime library for TypeScript helper functions"
HOMEPAGE = "https://www.typescriptlang.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "0BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f938d99cba29007eeae26d80a9a4cfa6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/tslib/-/tslib-2.4.0.tgz"
SRC_URI[md5sum] = "b560d320001cfd85caf589e8f60e877c"
SRC_URI[sha256sum] = "eb5584df2a0098a11ea92745634ea55dd65db0d36801b22c62c9a47836596149"

NPM_PKGNAME = "tslib"

inherit npmhelper
inherit native
