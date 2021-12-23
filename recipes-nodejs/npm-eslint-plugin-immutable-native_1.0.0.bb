SUMMARY = "NPM: eslint-plugin-immutable"
DESCRIPTION = "ESLint plugin to disable all mutation in JavaScript."
HOMEPAGE = "https://github.com/jhusain/eslint-plugin-immutable#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-immutable/-/eslint-plugin-immutable-1.0.0.tgz"
SRC_URI[md5sum] = "143abfe764122f637d99fc3f780099d0"
SRC_URI[sha256sum] = "7993090916606af1ccc9e7f18a471c705fa4c0d8708d4e71520b4781b48aea0e"

NPM_PKGNAME = "eslint-plugin-immutable"

inherit npmhelper
inherit native
