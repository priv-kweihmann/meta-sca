SUMMARY = "NPM: prettier"
DESCRIPTION = "Prettier is an opinionated code formatter"
HOMEPAGE = "https://prettier.io"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0b7377e8ff45f6d15cb82b02e64d11d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/prettier/-/prettier-2.5.1.tgz"
SRC_URI[md5sum] = "bcab94dca007dd6b24be6ab194d86fc6"
SRC_URI[sha256sum] = "2db9110490a01474032b198cca7e279866bb6dd8bcab3ed81eccfd1478164e6c"

NPM_PKGNAME = "prettier"

inherit npmhelper
inherit native
