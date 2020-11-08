SUMMARY = "NPM: postcss-scss"
DESCRIPTION = "SCSS parser for PostCSS"
HOMEPAGE = "https://github.com/postcss/postcss-scss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-postcss-native"

SRC_URI = "https://registry.npmjs.org/postcss-scss/-/postcss-scss-3.0.4.tgz"
SRC_URI[md5sum] = "79d89633fda771b47655268961259ea3"
SRC_URI[sha256sum] = "937fce405c66fecdb54f321ec169c76c20677576b811d9e3c7d0989801cfaac0"

NPM_PKGNAME = "postcss-scss"

inherit npmhelper
inherit native
