SUMMARY = "NPM: postcss-scss"
DESCRIPTION = "SCSS parser for PostCSS"
HOMEPAGE = "https://github.com/postcss/postcss-scss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/postcss-scss/-/postcss-scss-4.0.0.tgz"
SRC_URI[md5sum] = "8599c8203628de4c3116fccea02dd3a7"
SRC_URI[sha256sum] = "f00c78c70f282ae96a996e394ea9d7269f97abe7ec9e11897e88732283ecda56"

NPM_PKGNAME = "postcss-scss"

inherit npmhelper
inherit native
