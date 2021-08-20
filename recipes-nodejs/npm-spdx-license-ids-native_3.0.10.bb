SUMMARY = "NPM: spdx-license-ids"
DESCRIPTION = "A list of SPDX license identifiers"
HOMEPAGE = "https://github.com/jslicense/spdx-license-ids#readme"

LICENSE = "CC0-1.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=52;md5=21f0b36191d4379feb6bc72f1ad40255"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/spdx-license-ids/-/spdx-license-ids-3.0.10.tgz"
SRC_URI[md5sum] = "0cb52e7493ebe9dab5f77316339b0034"
SRC_URI[sha256sum] = "0399b22568b1f8ecf797e04d6db2570495d0e226d6e597f398ee06e6e997f8b6"

NPM_PKGNAME = "spdx-license-ids"

inherit npmhelper
inherit native
