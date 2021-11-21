SUMMARY = "NPM: prettier"
DESCRIPTION = "Prettier is an opinionated code formatter"
HOMEPAGE = "https://prettier.io"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0b7377e8ff45f6d15cb82b02e64d11d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/prettier/-/prettier-2.4.1.tgz"
SRC_URI[md5sum] = "7d79ccfb357686bf7402131fdd16b5f1"
SRC_URI[sha256sum] = "3c19d08daa9f78170493a4022a1901c51bf67b405c0b72c14ad607a28cb243e6"

NPM_PKGNAME = "prettier"

inherit npmhelper
inherit native
