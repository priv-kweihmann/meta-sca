SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.3.tgz"
SRC_URI[md5sum] = "9c69c6ae907c70bb48fc06a7df6d2f62"
SRC_URI[sha256sum] = "7606a91aaae889d4f81c283d6cf040ee48a9a85a91daa05949b1740fa359db4e"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
