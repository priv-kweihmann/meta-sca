SUMMARY = "NPM: prettier"
DESCRIPTION = "Prettier is an opinionated code formatter"
HOMEPAGE = "https://prettier.io"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0b7377e8ff45f6d15cb82b02e64d11d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/prettier/-/prettier-2.5.0.tgz"
SRC_URI[md5sum] = "01f1356559f91b5f0cbc5e393a31469a"
SRC_URI[sha256sum] = "21faa55daf1ea29fb1c021689808d44f7d57a297a9b73cd092bf58faed53aee1"

NPM_PKGNAME = "prettier"

inherit npmhelper
inherit native
