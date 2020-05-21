SUMMARY = "NPM: eslint-plugin-array-func"
DESCRIPTION = "Rules dealing with Array functions and methods."
HOMEPAGE = "https://github.com/freaktechnik/eslint-plugin-array-func#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a21b38275e7647340357b8e707f61495"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-plugin-array-func/-/eslint-plugin-array-func-3.1.6.tgz"
SRC_URI[md5sum] = "678dd54a6e8c3ef4975b997accd6e827"
SRC_URI[sha256sum] = "e37e2d20c5d806365692e924197dc7813ef2e2cf0b4b2779d4172b17998bded3"

NPM_PKGNAME = "eslint-plugin-array-func"

inherit npmhelper
inherit native
