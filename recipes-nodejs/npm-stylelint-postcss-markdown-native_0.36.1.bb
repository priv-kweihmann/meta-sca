SUMMARY = "NPM: @stylelint/postcss-markdown"
DESCRIPTION = "PostCSS syntax for parsing Markdown"
HOMEPAGE = "https://github.com/stylelint/postcss-markdown#readme"

DEPENDS = "npm-remark-native npm-unist-util-find-all-after-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8dc045fd8da5f5d84ad9bf5c7f2d2fa0"

SRC_URI = "https://registry.npmjs.org/@stylelint/postcss-markdown/-/postcss-markdown-0.36.1.tgz"
SRC_URI[md5sum] = "e77203a122d679db8cadf1d372c1b849"
SRC_URI[sha256sum] = "96d371e411e04ea649d68a02b675a9c7f25b85c2181d8813f3574af0e2ecff70"

NPM_PKGNAME = "@stylelint/postcss-markdown"

inherit npmhelper
inherit native
