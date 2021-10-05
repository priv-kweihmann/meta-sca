SUMMARY = "NPM: core-js"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js/-/core-js-3.18.1.tgz"
SRC_URI[md5sum] = "83122174aabfbe14e9a704dc466471bf"
SRC_URI[sha256sum] = "4b6d791bbcd01eac1cdefd5511c6bfc92532bce11718d4bf6b7fb64155bbd3f3"

NPM_PKGNAME = "core-js"

inherit npmhelper
inherit native
