SUMMARY = "NPM: chalk"
DESCRIPTION = "Terminal string styling done right"
HOMEPAGE = "https://github.com/chalk/chalk#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/chalk/-/chalk-5.0.1.tgz"
SRC_URI[md5sum] = "0b9aae38f98a33ce9d5b65d5afb31d99"
SRC_URI[sha256sum] = "fe70f9192a7bec70cd143c082faf12e4f6d2fbc81e7d692e6deda222bf34ff1e"

NPM_PKGNAME = "chalk"

inherit npmhelper
inherit native
