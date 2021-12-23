SUMMARY = "NPM: reusify"
DESCRIPTION = "Reuse objects and functions with style"
HOMEPAGE = "https://github.com/mcollina/reusify#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64af5da073cd15043e95dc5b443951ee"

SRC_URI = "https://registry.npmjs.org/reusify/-/reusify-1.0.4.tgz"
SRC_URI[md5sum] = "e429d2d2e18dc0f1d2247addfa348b39"
SRC_URI[sha256sum] = "aa500cd517fa2fa7aeabb96a02baf85d9f0d02a29e2a99c77516053304a133c4"

NPM_PKGNAME = "reusify"

inherit npmhelper
inherit native
