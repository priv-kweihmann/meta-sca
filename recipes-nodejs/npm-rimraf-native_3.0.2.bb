SUMMARY = "NPM: rimraf"
DESCRIPTION = "A deep deletion module for node (like `rm -rf`)"
HOMEPAGE = "https://github.com/isaacs/rimraf#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = "npm-glob-native"

SRC_URI = "https://registry.npmjs.org/rimraf/-/rimraf-3.0.2.tgz"
SRC_URI[md5sum] = "c794495fee118854a7cbd585a19a0fa8"
SRC_URI[sha256sum] = "5876c20fd84707b7056ec61ccee1a71e80fec1657650010bd4dac828bb977f52"

NPM_PKGNAME = "rimraf"

inherit npmhelper
inherit native
