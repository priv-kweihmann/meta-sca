SUMMARY = "NPM: colord"
DESCRIPTION = "👑 A tiny yet powerful tool for high-performance color manipulations and conversions"
HOMEPAGE = "https://github.com/omgovich/colord#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=903bd2f7f1b4db3cd376010ef4d87040"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/colord/-/colord-2.9.2.tgz"
SRC_URI[md5sum] = "265feb49d4c66943d6d01639dc275f1f"
SRC_URI[sha256sum] = "2c95dfde7519b0ca4d29a478a59cb249263018f310ff7db714ac8927c19e62d5"

NPM_PKGNAME = "colord"

inherit npmhelper
inherit native
