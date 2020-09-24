SUMMARY = "NPM: postcss-scss"
DESCRIPTION = "SCSS parser for PostCSS"
HOMEPAGE = "https://github.com/postcss/postcss-scss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-postcss-native"

SRC_URI = "https://registry.npmjs.org/postcss-scss/-/postcss-scss-3.0.1.tgz"
SRC_URI[md5sum] = "6d0f33f5f7ac7aa58854a103ed2f2cdd"
SRC_URI[sha256sum] = "5773a02f7c649db339cb6ab1223ed9b1fe94ce2da365361992b9366667008f31"

NPM_PKGNAME = "postcss-scss"

inherit npmhelper
inherit native
