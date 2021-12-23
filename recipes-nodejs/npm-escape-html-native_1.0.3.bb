SUMMARY = "NPM: escape-html"
DESCRIPTION = "Escape string for use in HTML"
HOMEPAGE = "https://github.com/component/escape-html"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f8746101546eeb9e4f6de64bb8bdf595"

SRC_URI = "https://registry.npmjs.org/escape-html/-/escape-html-1.0.3.tgz"
SRC_URI[md5sum] = "0e644d0c31d5f4c2eeeaef9566add5e9"
SRC_URI[sha256sum] = "a101155c3cbdfb1e4f98f2f83c8b5e392db6accfa606df0eba8b87a5762b0366"

NPM_PKGNAME = "escape-html"

inherit npmhelper
inherit native
