SUMMARY = "NPM: cspell-dict-php"
DESCRIPTION = "Php dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/php#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-php/-/cspell-dict-php-1.0.15.tgz"
SRC_URI[md5sum] = "e08b0f46b1fd862fe5721264677cced6"
SRC_URI[sha256sum] = "6f407be1390c644f9141756f62142150048ae2f1818487a91533457f9384d98c"

NPM_PKGNAME = "cspell-dict-php"

inherit npmhelper
inherit native
