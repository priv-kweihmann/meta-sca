SUMMARY = "NPM: cspell-dict-php"
DESCRIPTION = "Php dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/php#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-php/-/cspell-dict-php-1.0.19.tgz"
SRC_URI[md5sum] = "69c2ec5a8c0a6df03cb507bf7edb2fc9"
SRC_URI[sha256sum] = "4599df3abf992e64ccc04ef55b10af2cb4b7e9ea81cc7b9b37b34d0673434b50"

NPM_PKGNAME = "cspell-dict-php"

inherit npmhelper
inherit native
