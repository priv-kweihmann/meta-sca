SUMMARY = "NPM: spdx-exceptions"
DESCRIPTION = "list of SPDX standard license exceptions"
HOMEPAGE = "https://github.com/kemitchell/spdx-exceptions.json#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "CC-BY-3.0"
LIC_FILES_CHKSUM = "file://README.md;md5=3da6b6bd12471d6d6b5d357602830417"

SRC_URI = "https://registry.npmjs.org/spdx-exceptions/-/spdx-exceptions-2.3.0.tgz"
SRC_URI[md5sum] = "acbb50a4dc418357a51310b852eb2e38"
SRC_URI[sha256sum] = "6764ce70da3e6a716b2c9688e9c0adbe384b04233f63f19d986fd057522a0410"

NPM_PKGNAME = "spdx-exceptions"

inherit npmhelper
inherit native
