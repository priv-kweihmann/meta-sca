SUMMARY = "NPM: postcss-less"
DESCRIPTION = "LESS parser for PostCSS"
HOMEPAGE = "https://github.com/shellscape/postcss-less"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0241caf92f040ee6f8c5a1e1f7892698"

DEPENDS = "npm-postcss-native"

SRC_URI = "https://registry.npmjs.org/postcss-less/-/postcss-less-4.0.1.tgz"
SRC_URI[md5sum] = "9b51d38bd77b0c8098a489c38278a758"
SRC_URI[sha256sum] = "86ac408f9d8591f03a7497b8b7620c1175d58350b5310e19464a87c80705090c"

NPM_PKGNAME = "postcss-less"

inherit npmhelper
inherit native
