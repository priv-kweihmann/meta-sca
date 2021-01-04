SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.8.2.tgz"
SRC_URI[md5sum] = "0cb5d987273e652b8cf4043071708e68"
SRC_URI[sha256sum] = "bf58b59496a7e0aff79e23f18ec240155238d71a5e94244c831dea007abaf218"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
