SUMMARY = "NPM: type-check"
DESCRIPTION = "type-check allows you to check the types of JavaScript values at runtime with a Haskell like type syntax."
HOMEPAGE = "https://github.com/gkz/type-check"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7733af876e78a187f3a51e7c276ae883"

DEPENDS = "npm-prelude-ls-native"

SRC_URI = "https://registry.npmjs.org/type-check/-/type-check-0.4.0.tgz"
SRC_URI[md5sum] = "a3d41bd30b6f293b58325f5b56260e0e"
SRC_URI[sha256sum] = "8035d10cc48e2692358ac06cbadfa795279aaf6b3c04f29bd322f6df09513f8e"

NPM_PKGNAME = "type-check"

inherit npmhelper
inherit native
