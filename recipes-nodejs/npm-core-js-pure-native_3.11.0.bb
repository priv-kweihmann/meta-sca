SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.11.0.tgz"
SRC_URI[md5sum] = "ad88d9c17e9d8457473319c90e3d0667"
SRC_URI[sha256sum] = "349a3fd54f2aa0539cd459ba22ee2f8fdfa06ceddb8b36716c263c2bafe07d97"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
