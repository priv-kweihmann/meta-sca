SUMMARY = "NPM: rc-config-loader"
DESCRIPTION = "load config file from .{product}rc.{json,yml,js}"
HOMEPAGE = "https://github.com/azu/rc-config-loader"

DEPENDS = "npm-debug-native npm-js-yaml-native npm-json5-native npm-require-from-string-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

SRC_URI = "https://registry.npmjs.org/rc-config-loader/-/rc-config-loader-3.0.0.tgz"
SRC_URI[md5sum] = "75d724b0fe3a2af941ed05098e067e00"
SRC_URI[sha256sum] = "c4e5cdd0c8d94a3dd3445a4239d2589898bcc27fc03a3f7bf85388dd44fa9b6f"

NPM_PKGNAME = "rc-config-loader"

inherit npmhelper
inherit native
