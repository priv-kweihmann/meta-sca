SUMMARY = "NPM: eslint-plugin-deprecate"
DESCRIPTION = "[![NPM version](http://img.shields.io/npm/v/eslint-plugin-deprecate.svg)](https://www.npmjs.com/package/eslint-plugin-deprecate)"
HOMEPAGE = "https://github.com/AlexMost/eslint-plugin-deprecate#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a9ffaaac1eaf685acfe8512de46342e6"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-deprecate/-/eslint-plugin-deprecate-0.7.0.tgz"
SRC_URI[md5sum] = "ef7b9addac35944d3ee6c55bc5bfa923"
SRC_URI[sha256sum] = "afec00cd149867041ff5c0937883547f66b373e1572d088ddcb2a6c9c82e8b25"

NPM_PKGNAME = "eslint-plugin-deprecate"

inherit npmhelper
inherit native
