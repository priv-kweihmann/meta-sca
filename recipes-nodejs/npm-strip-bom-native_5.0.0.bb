SUMMARY = "NPM: strip-bom"
DESCRIPTION = "Strip UTF-8 byte order mark (BOM) from a string"
HOMEPAGE = "https://github.com/sindresorhus/strip-bom#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/strip-bom/-/strip-bom-5.0.0.tgz"
SRC_URI[md5sum] = "64c988e5d6c33f0f6d161b38f020ee0f"
SRC_URI[sha256sum] = "2564be0b0df95f034f085530e554e507833146923cbed55e50c15c01d6c3ed2d"

NPM_PKGNAME = "strip-bom"

inherit npmhelper
inherit native
