SUMMARY = "NPM: flatted"
DESCRIPTION = "A super light and fast circular JSON parser."
HOMEPAGE = "https://github.com/WebReflection/flatted#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73d317079e156478653d02207ca984da"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/flatted/-/flatted-3.2.4.tgz"
SRC_URI[md5sum] = "87c790e97687cf4df5b322573d41ffd1"
SRC_URI[sha256sum] = "15bf2b54fa1195b16182db51e4c81a058676dd25157247169e35466d4b1a8678"

NPM_PKGNAME = "flatted"

inherit npmhelper
inherit native
