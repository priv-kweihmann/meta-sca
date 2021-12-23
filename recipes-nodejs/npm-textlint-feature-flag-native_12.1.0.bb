SUMMARY = "NPM: @textlint/feature-flag"
DESCRIPTION = "textlint internal feature flag manager."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/feature-flag/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@textlint/feature-flag/-/feature-flag-12.1.0.tgz"
SRC_URI[md5sum] = "aa0825ce88763cf46da98a918e401161"
SRC_URI[sha256sum] = "0bf13053de0fa2ea7d8a91a7851008dac3bbf963c8c8d61ebdee1b80e174c7b5"

NPM_PKGNAME = "@textlint/feature-flag"

inherit npmhelper
inherit native
