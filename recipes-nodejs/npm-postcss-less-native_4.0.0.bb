SUMMARY = "NPM: postcss-less"
DESCRIPTION = "LESS parser for PostCSS"
HOMEPAGE = "https://github.com/shellscape/postcss-less"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0241caf92f040ee6f8c5a1e1f7892698"

DEPENDS = "npm-postcss-native"

SRC_URI = "https://registry.npmjs.org/postcss-less/-/postcss-less-4.0.0.tgz"
SRC_URI[md5sum] = "5779c76d1ae83ed6b5ddcf4420e8fed8"
SRC_URI[sha256sum] = "34a3c85abfde619a471bbc5f0758ae00b7b61cb485637781c1cf4c640ddd6059"

NPM_PKGNAME = "postcss-less"

inherit npmhelper
inherit native
