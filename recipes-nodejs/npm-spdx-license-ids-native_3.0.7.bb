SUMMARY = "NPM: spdx-license-ids"
DESCRIPTION = "A list of SPDX license identifiers"
HOMEPAGE = "https://github.com/jslicense/spdx-license-ids#readme"

LICENSE = "CC0-1.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=52;md5=21f0b36191d4379feb6bc72f1ad40255"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/spdx-license-ids/-/spdx-license-ids-3.0.7.tgz"
SRC_URI[md5sum] = "77db7a844c31970975a28b55fcb46ad7"
SRC_URI[sha256sum] = "b0d9f2f44909cb65a84104ea78b7ac8d9ad8b302304432eae12dd882e0871a98"

NPM_PKGNAME = "spdx-license-ids"

inherit npmhelper
inherit native
