SUMMARY = "NPM: spdx-license-ids"
DESCRIPTION = "A list of SPDX license identifiers"
HOMEPAGE = "https://github.com/jslicense/spdx-license-ids#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "CC0-1.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=52;md5=21f0b36191d4379feb6bc72f1ad40255"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/spdx-license-ids/-/spdx-license-ids-3.0.11.tgz"
SRC_URI[md5sum] = "f23bcef1dddee8c6adde84ee5d2532f1"
SRC_URI[sha256sum] = "e0c164edbde4c2f68009c409caa439a1cdc2c19ba53a16910e7ad3db55e60913"

NPM_PKGNAME = "spdx-license-ids"

inherit npmhelper
inherit native
