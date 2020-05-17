SUMMARY = "NPM: spdx-license-ids"
DESCRIPTION = "A list of SPDX license identifiers"
HOMEPAGE = "https://github.com/shinnn/spdx-license-ids#readme"

LICENSE = "CC0-1.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=52;md5=21f0b36191d4379feb6bc72f1ad40255"

SRC_URI = "https://registry.npmjs.org/spdx-license-ids/-/spdx-license-ids-3.0.5.tgz"
SRC_URI[md5sum] = "bc22d2074eadea13e0556ca1045916a9"
SRC_URI[sha256sum] = "0e2ab55d09703c4024d26e5f230348ef026152db98dc9b57b387c5574c0b4dae"

NPM_PKGNAME = "spdx-license-ids"

inherit npmhelper
inherit native
