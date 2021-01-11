SUMMARY = "NPM: rc-config-loader"
DESCRIPTION = "load config file from .{product}rc.{json,yml,js}"
HOMEPAGE = "https://github.com/azu/rc-config-loader"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-debug-native \
           npm-js-yaml-native \
           npm-json5-native \
           npm-require-from-string-native"

SRC_URI = "https://registry.npmjs.org/rc-config-loader/-/rc-config-loader-4.0.0.tgz"
SRC_URI[md5sum] = "632fdb14d0e52c29f7b67fdf1f5a667c"
SRC_URI[sha256sum] = "6f884a9a13fabecbd7bcfd9d324857ece8329a2096aceff77bd15bcb0ff47822"

NPM_PKGNAME = "rc-config-loader"

inherit npmhelper
inherit native
