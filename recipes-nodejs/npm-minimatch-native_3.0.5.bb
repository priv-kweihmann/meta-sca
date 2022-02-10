SUMMARY = "NPM: minimatch"
DESCRIPTION = "a glob matcher in javascript"
HOMEPAGE = "https://github.com/isaacs/minimatch#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = "npm-brace-expansion-native"

SRC_URI = "https://registry.npmjs.org/minimatch/-/minimatch-3.0.5.tgz"
SRC_URI[md5sum] = "2f176ceb67a64703be495a9b943ff75e"
SRC_URI[sha256sum] = "40a7bae4566a4c4dfc2a534a4ff93d96eb8bfe65630be1c951f029860c857b89"

NPM_PKGNAME = "minimatch"

inherit npmhelper
inherit native
