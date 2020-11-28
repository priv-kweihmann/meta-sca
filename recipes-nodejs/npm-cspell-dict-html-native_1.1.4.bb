SUMMARY = "NPM: cspell-dict-html"
DESCRIPTION = "HTML dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/html#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-html/-/cspell-dict-html-1.1.4.tgz"
SRC_URI[md5sum] = "3b6affcb3d40b7419167742610dc0c64"
SRC_URI[sha256sum] = "8b3b6380305ba7415ebef1d43e28c253ad1e6f93b79194b6afd157d5e3c290f5"

NPM_PKGNAME = "cspell-dict-html"

inherit npmhelper
inherit native
