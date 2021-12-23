SUMMARY = "NPM: chalk"
DESCRIPTION = "Terminal string styling done right"
HOMEPAGE = "https://github.com/chalk/chalk#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/chalk/-/chalk-5.0.0.tgz"
SRC_URI[md5sum] = "c5d0ee11aabf803c8db95250f2dc519f"
SRC_URI[sha256sum] = "adf72284973550f25f782e73034a26dd6026dd52c542555db82e2c25b249b269"

NPM_PKGNAME = "chalk"

inherit npmhelper
inherit native
