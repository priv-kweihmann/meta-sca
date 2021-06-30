SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.15.2.tgz"
SRC_URI[md5sum] = "d4f5ba4295d51657580564e94c67db98"
SRC_URI[sha256sum] = "f345b3dc9fd6cd69d8f22b226057b2f713e1961d45aefde16da2ec3cd985326b"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
