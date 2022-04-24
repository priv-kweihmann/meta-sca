SUMMARY = "NPM: eslint-plugin-security"
DESCRIPTION = "Security rules for eslint"
HOMEPAGE = "https://github.com/nodesecurity/eslint-plugin-security#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0951aaf8fe866ea9c9b60e3e1d882fc0"

DEPENDS = "npm-safe-regex-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-security/-/eslint-plugin-security-1.5.0.tgz"
SRC_URI[md5sum] = "fa07d2f8ced7c1a74149b9546d358ccf"
SRC_URI[sha256sum] = "bf2c079a1e3da2bc2e0d5ad081ff45716c24903d8b7fa4de1d929e93efa77385"

NPM_PKGNAME = "eslint-plugin-security"

inherit npmhelper
inherit native
