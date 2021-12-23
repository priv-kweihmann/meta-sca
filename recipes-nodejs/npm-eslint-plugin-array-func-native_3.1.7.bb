SUMMARY = "NPM: eslint-plugin-array-func"
DESCRIPTION = "Rules dealing with Array functions and methods."
HOMEPAGE = "https://github.com/freaktechnik/eslint-plugin-array-func#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a21b38275e7647340357b8e707f61495"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-plugin-array-func/-/eslint-plugin-array-func-3.1.7.tgz"
SRC_URI[md5sum] = "5fbb6b64c5660d11f5627a24b40461f4"
SRC_URI[sha256sum] = "f7fc33d8fdb6e1fe5453357b9a0150d9cbee21ffd01c83e4c0be55713c9efae8"

NPM_PKGNAME = "eslint-plugin-array-func"

inherit npmhelper
inherit native
