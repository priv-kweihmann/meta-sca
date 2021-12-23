SUMMARY = "NPM: eslint-plugin-this"
DESCRIPTION = "ESLint plugin to disallow the use of 'this'"
HOMEPAGE = "https://github.com/matijs/eslint-plugin-this#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4094bf2f3f6804a8bc5a7d0d98660eee"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-this/-/eslint-plugin-this-0.2.3.tgz"
SRC_URI[md5sum] = "f9d8a93037b0ccefffaeed41fb08f343"
SRC_URI[sha256sum] = "586410947d0c0e7570d24445198e5bfec9347b4f3a8c2ddd3f372c15be39f347"

NPM_PKGNAME = "eslint-plugin-this"

inherit npmhelper
inherit native
