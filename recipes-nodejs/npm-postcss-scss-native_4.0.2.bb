SUMMARY = "NPM: postcss-scss"
DESCRIPTION = "SCSS parser for PostCSS"
HOMEPAGE = "https://github.com/postcss/postcss-scss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/postcss-scss/-/postcss-scss-4.0.2.tgz"
SRC_URI[md5sum] = "5e1809e362580277244e3d01c7b2aaa0"
SRC_URI[sha256sum] = "86faf6a9886e042c60ecbb389a06204c6f9f257da8e720714cfb97196d1fe550"

NPM_PKGNAME = "postcss-scss"

inherit npmhelper
inherit native
