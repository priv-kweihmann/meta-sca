SUMMARY = "NPM: postcss-less"
DESCRIPTION = "LESS parser for PostCSS"
HOMEPAGE = "https://github.com/shellscape/postcss-less"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0241caf92f040ee6f8c5a1e1f7892698"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/postcss-less/-/postcss-less-5.0.0.tgz"
SRC_URI[md5sum] = "12e17f21a2bc0eb055ca4ae6ebc57faf"
SRC_URI[sha256sum] = "56cacf376baead488e1bcf5128d48599be78ac1e9eb43dc373ef705fd539000a"

NPM_PKGNAME = "postcss-less"

inherit npmhelper
inherit native
