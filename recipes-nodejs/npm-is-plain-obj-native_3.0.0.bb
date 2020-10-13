SUMMARY = "NPM: is-plain-obj"
DESCRIPTION = "Check if a value is a plain object"
HOMEPAGE = "https://github.com/sindresorhus/is-plain-obj#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-plain-obj/-/is-plain-obj-3.0.0.tgz"
SRC_URI[md5sum] = "e0e74796bf06c2516ef86ed49daba57a"
SRC_URI[sha256sum] = "d257597825773e4e3f183f055af0cb6b4e5cea01eb1b32a7febdd583f5ee2e20"

NPM_PKGNAME = "is-plain-obj"

inherit npmhelper
inherit native
