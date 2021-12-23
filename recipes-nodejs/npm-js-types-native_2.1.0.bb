SUMMARY = "NPM: js-types"
DESCRIPTION = "List of JavaScript types"
HOMEPAGE = "https://github.com/sindresorhus/js-types#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/js-types/-/js-types-2.1.0.tgz"
SRC_URI[md5sum] = "4b8bd613f76d9b72847a76938b9f5ea3"
SRC_URI[sha256sum] = "510b5ff26581998c2a91e61325042c4a85b20f4700df8fac1ff75aa618a59621"

NPM_PKGNAME = "js-types"

inherit npmhelper
inherit native
