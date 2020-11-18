SUMMARY = "NPM: @stylelint/postcss-markdown"
DESCRIPTION = "PostCSS syntax for parsing Markdown"
HOMEPAGE = "https://github.com/stylelint/postcss-markdown#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8dc045fd8da5f5d84ad9bf5c7f2d2fa0"

DEPENDS = "npm-remark-native \
           npm-unist-util-find-all-after-native"

SRC_URI = "https://registry.npmjs.org/@stylelint/postcss-markdown/-/postcss-markdown-0.36.2.tgz"
SRC_URI[md5sum] = "9aa7eaa6e34a57f61151ccdcc536c802"
SRC_URI[sha256sum] = "415e1ca066e9fe83f2f3458584a056707894ee0657d533819e9717a75de90843"

NPM_PKGNAME = "@stylelint/postcss-markdown"

inherit npmhelper
inherit native
