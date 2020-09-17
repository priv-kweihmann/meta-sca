SUMMARY = "NPM: spdx-license-ids"
DESCRIPTION = "A list of SPDX license identifiers"
HOMEPAGE = "https://github.com/jslicense/spdx-license-ids#readme"

LICENSE = "CC0-1.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=52;md5=21f0b36191d4379feb6bc72f1ad40255"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/spdx-license-ids/-/spdx-license-ids-3.0.6.tgz"
SRC_URI[md5sum] = "7a321e3bab13120572904bee6a64aeac"
SRC_URI[sha256sum] = "71bfe9fee0a5ea5f3dc75ee46b81ac40f95374e34fefd80c025c9274aa0972d8"

NPM_PKGNAME = "spdx-license-ids"

inherit npmhelper
inherit native
