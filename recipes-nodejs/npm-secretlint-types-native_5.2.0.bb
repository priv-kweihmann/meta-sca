SUMMARY = "NPM: @secretlint/types"
DESCRIPTION = "A typing package for @secretlint"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/types/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/types/-/types-5.2.0.tgz"
SRC_URI[md5sum] = "ab08498f53beefb3392ce47902796f72"
SRC_URI[sha256sum] = "fb2486b173d34bf0dd3f061bc7225fcd4e3675a9f6d9e01dbe47e1231ea10c99"

NPM_PKGNAME = "@secretlint/types"

inherit npmhelper
inherit native
