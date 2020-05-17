SUMMARY = "NPM: cspell-dict-php"
DESCRIPTION = "Php dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/php#readme"

DEPENDS = "npm-configstore-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

SRC_URI = "https://registry.npmjs.org/cspell-dict-php/-/cspell-dict-php-1.0.13.tgz"
SRC_URI[md5sum] = "1f56129bec5eb922b5ea8a899be2c1da"
SRC_URI[sha256sum] = "dc2023179069e0978c5c95edb1a92fc675e22592245ac5a3877dd429c736587f"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-dict-php"

inherit npmhelper
inherit native
