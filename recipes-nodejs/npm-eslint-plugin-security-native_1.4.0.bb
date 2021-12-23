SUMMARY = "NPM: eslint-plugin-security"
DESCRIPTION = "Security rules for eslint"
HOMEPAGE = "https://github.com/nodesecurity/eslint-plugin-security#readme"

DEPENDS = "npm-safe-regex-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0951aaf8fe866ea9c9b60e3e1d882fc0"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-security/-/eslint-plugin-security-1.4.0.tgz"
SRC_URI[md5sum] = "933c7a7613e8638077e21525e8d06ec1"
SRC_URI[sha256sum] = "1274c0c55f71e3cefa2959b4468f2f4d84ae51ca37d3a65852dd2977841feb22"

NPM_PKGNAME = "eslint-plugin-security"

inherit npmhelper
inherit native
