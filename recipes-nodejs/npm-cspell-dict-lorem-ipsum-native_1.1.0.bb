SUMMARY = "NPM: cspell-dict-lorem-ipsum"
DESCRIPTION = "Lorem-ipsum dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/lorem-ipsum#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-lorem-ipsum/-/cspell-dict-lorem-ipsum-1.1.0.tgz"
SRC_URI[md5sum] = "ec09cab4783b60c281ae50402162eed5"
SRC_URI[sha256sum] = "b2ddd16c1f7a1410f7af112a73161711891e7f08a1afd8c78dfdcdcc3834d9a6"

NPM_PKGNAME = "cspell-dict-lorem-ipsum"

inherit npmhelper
inherit native
