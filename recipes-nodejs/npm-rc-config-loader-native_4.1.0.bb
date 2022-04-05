SUMMARY = "NPM: rc-config-loader"
DESCRIPTION = "load config file from .{product}rc.{json,yml,js}"
HOMEPAGE = "https://github.com/azu/rc-config-loader"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-debug-native \
           npm-js-yaml-native \
           npm-json5-native \
           npm-require-from-string-native"

SRC_URI = "https://registry.npmjs.org/rc-config-loader/-/rc-config-loader-4.1.0.tgz"
SRC_URI[md5sum] = "8578cf09f79d948177339b0b1613aeeb"
SRC_URI[sha256sum] = "f5b5ac90c18b429593894a85b8e655f32318dc9581583acde44a4dae84a0b0c2"

NPM_PKGNAME = "rc-config-loader"

inherit npmhelper
inherit native
