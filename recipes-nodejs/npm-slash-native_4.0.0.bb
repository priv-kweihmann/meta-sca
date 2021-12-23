SUMMARY = "NPM: slash"
DESCRIPTION = "Convert Windows backslash paths to slash paths"
HOMEPAGE = "https://github.com/sindresorhus/slash#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/slash/-/slash-4.0.0.tgz"
SRC_URI[md5sum] = "26be13a8f6205c125ee668ee91da9bbf"
SRC_URI[sha256sum] = "9879394232524ebb32178fb7c5dabb316a153305526fb9fa83d1876da1664444"

NPM_PKGNAME = "slash"

inherit npmhelper
inherit native
