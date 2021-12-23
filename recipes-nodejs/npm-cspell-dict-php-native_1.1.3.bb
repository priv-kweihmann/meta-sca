SUMMARY = "NPM: cspell-dict-php"
DESCRIPTION = "Php dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/php#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-php/-/cspell-dict-php-1.1.3.tgz"
SRC_URI[md5sum] = "7d77b0e8e0fffc0c041e20ecf77797d3"
SRC_URI[sha256sum] = "b9bef9ff465e42699b039c12f402044e4337889ead4b15a6814dc801cb851e18"

NPM_PKGNAME = "cspell-dict-php"

inherit npmhelper
inherit native
