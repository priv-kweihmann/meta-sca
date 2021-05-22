SUMMARY = "NPM: spdx-license-ids"
DESCRIPTION = "A list of SPDX license identifiers"
HOMEPAGE = "https://github.com/jslicense/spdx-license-ids#readme"

LICENSE = "CC0-1.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=52;md5=21f0b36191d4379feb6bc72f1ad40255"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/spdx-license-ids/-/spdx-license-ids-3.0.9.tgz"
SRC_URI[md5sum] = "59a235f291f1bfd8400e2f8422610ca0"
SRC_URI[sha256sum] = "7c8523ad89183398cff8c82c721e604a06dd357c86b72d6ef619785933bb8e08"

NPM_PKGNAME = "spdx-license-ids"

inherit npmhelper
inherit native
