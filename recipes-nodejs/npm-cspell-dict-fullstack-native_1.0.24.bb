SUMMARY = "NPM: cspell-dict-fullstack"
DESCRIPTION = "Dictionary of terms used in Fullstack development."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fullstack#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fullstack/-/cspell-dict-fullstack-1.0.24.tgz"
SRC_URI[md5sum] = "3749f639e2d587d19947c1bd0d3ca721"
SRC_URI[sha256sum] = "07a0d5420af88651d835315ba94e74c09e30daa8ba28dae0da51f79eff1789ad"

NPM_PKGNAME = "cspell-dict-fullstack"

inherit npmhelper
inherit native
