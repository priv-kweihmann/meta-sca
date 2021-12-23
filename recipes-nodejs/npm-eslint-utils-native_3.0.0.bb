SUMMARY = "NPM: eslint-utils"
DESCRIPTION = "Utilities for ESLint plugins."
HOMEPAGE = "https://github.com/mysticatea/eslint-utils#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8f21789009221b0b37faaa24544da54"

DEPENDS = "npm-eslint-visitor-keys-native"

SRC_URI = "https://registry.npmjs.org/eslint-utils/-/eslint-utils-3.0.0.tgz"
SRC_URI[md5sum] = "5b013ea724da0585e1d36d90de66b319"
SRC_URI[sha256sum] = "9038195805e1b7b5ddc0f587080d47d12a4ab50ca247a364eb299e09b3d01919"

NPM_PKGNAME = "eslint-utils"

inherit npmhelper
inherit native
