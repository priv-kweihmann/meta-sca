SUMMARY = "NPM: csslint"
DESCRIPTION = "CSSLint"
HOMEPAGE = "http://csslint.net/"

DEPENDS = "npm-clone-native npm-parserlib-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4097ca80a9f55d7734c0562f045f7632"

SRC_URI = "https://registry.npmjs.org/csslint/-/csslint-1.0.5.tgz"
SRC_URI[md5sum] = "86ac2064a6d01761d3be20f730ab58d9"
SRC_URI[sha256sum] = "032f508a4535ef30dbfe46a96453d11a1fcbd31b7f9b17bdee8e894c9822163a"

S = "${WORKDIR}/package"

NPM_PKGNAME = "csslint"

inherit npmhelper
inherit native
