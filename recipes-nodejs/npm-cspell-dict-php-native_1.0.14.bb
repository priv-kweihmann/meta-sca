SUMMARY = "NPM: cspell-dict-php"
DESCRIPTION = "Php dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/php#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-php/-/cspell-dict-php-1.0.14.tgz"
SRC_URI[md5sum] = "b11c47515d05b3fb55c2fbcd522dfbb0"
SRC_URI[sha256sum] = "9ea7810c062d587c96504810cbe84527f4c2ad14b3a4002d2743dffdd6dd4ae0"

NPM_PKGNAME = "cspell-dict-php"

inherit npmhelper
inherit native
