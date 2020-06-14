SUMMARY = "NPM: eslint-plugin-eslint-plugin"
DESCRIPTION = "An ESLint plugin for linting ESLint plugins"
HOMEPAGE = "https://github.com/not-an-aardvark/eslint-plugin-eslint-plugin#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0fe5948ec40e15deaf5c01bc0da29119"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-plugin-eslint-plugin/-/eslint-plugin-eslint-plugin-2.2.2.tgz"
SRC_URI[md5sum] = "0f2afbfa4b46042c552315e4d557e0bf"
SRC_URI[sha256sum] = "8a0ace8309c4ea0d26b10992d3670514533e3645af887a83eb31d5ca7618acad"

NPM_PKGNAME = "eslint-plugin-eslint-plugin"

inherit npmhelper
inherit native
