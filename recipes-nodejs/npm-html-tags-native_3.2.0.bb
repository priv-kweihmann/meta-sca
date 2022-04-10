SUMMARY = "NPM: html-tags"
DESCRIPTION = "List of standard HTML tags"
HOMEPAGE = "https://github.com/sindresorhus/html-tags#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/html-tags/-/html-tags-3.2.0.tgz"
SRC_URI[md5sum] = "d51693ca012b5baea995537794a1b42a"
SRC_URI[sha256sum] = "9eb21ab5bb3ca1a0a6a380c0a444765694b0c101db17a3b586ab60a01603eb31"

NPM_PKGNAME = "html-tags"

inherit npmhelper
inherit native
