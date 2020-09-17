SUMMARY = "NPM: postcss-scss"
DESCRIPTION = "SCSS parser for PostCSS"
HOMEPAGE = "https://github.com/postcss/postcss-scss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-postcss-native"

SRC_URI = "https://registry.npmjs.org/postcss-scss/-/postcss-scss-3.0.0.tgz"
SRC_URI[md5sum] = "dc23b97b3c5065707f2d3d3e4e4efb47"
SRC_URI[sha256sum] = "e9e7efb2fa01063a1bc36376b2b9f277e5a78baecf4cba7348577b0e258c5a16"

NPM_PKGNAME = "postcss-scss"

inherit npmhelper
inherit native
