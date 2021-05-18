SUMMARY = "NPM: spdx-license-ids"
DESCRIPTION = "A list of SPDX license identifiers"
HOMEPAGE = "https://github.com/jslicense/spdx-license-ids#readme"

LICENSE = "CC0-1.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=52;md5=21f0b36191d4379feb6bc72f1ad40255"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/spdx-license-ids/-/spdx-license-ids-3.0.8.tgz"
SRC_URI[md5sum] = "362e1c49bf78cbe5e9061dc05615e409"
SRC_URI[sha256sum] = "ac12947a3e35a6ade90e61a30f350ee4465f139c25a137ecc6a9911798e466e2"

NPM_PKGNAME = "spdx-license-ids"

inherit npmhelper
inherit native
