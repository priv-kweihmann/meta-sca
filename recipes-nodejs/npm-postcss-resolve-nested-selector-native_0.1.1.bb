SUMMARY = "NPM: postcss-resolve-nested-selector"
DESCRIPTION = "Resolve a nested selector in a PostCSS AST"


DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3648d1ce2efd21d8baeee8f5538f405"

SRC_URI = "https://registry.npmjs.org/postcss-resolve-nested-selector/-/postcss-resolve-nested-selector-0.1.1.tgz"
SRC_URI[md5sum] = "f7814ee2e5ba82347c4f9b1e2bf974fa"
SRC_URI[sha256sum] = "88ffd2433315509fe1931f4f07bd2818f1d85b5396534da6103320c79a639735"

NPM_PKGNAME = "postcss-resolve-nested-selector"

inherit npmhelper
inherit native
