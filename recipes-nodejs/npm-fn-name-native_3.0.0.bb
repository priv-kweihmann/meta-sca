SUMMARY = "NPM: fn-name"
DESCRIPTION = "Get the name of a named function"
HOMEPAGE = "https://github.com/sindresorhus/fn-name#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/fn-name/-/fn-name-3.0.0.tgz"
SRC_URI[md5sum] = "6beeb84b2ebc86da27f1d44ce2380e0a"
SRC_URI[sha256sum] = "2bfb62def12b76b3033f54b2758481dbdf913ebed5a8943ff39b16845a582854"

NPM_PKGNAME = "fn-name"

inherit npmhelper
inherit native
