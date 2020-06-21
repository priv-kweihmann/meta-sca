SUMMARY = "NPM: aria-query"
DESCRIPTION = "Programmatic access to the ARIA specification"
HOMEPAGE = "https://github.com/A11yance/aria-query#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cadce3caaeb4d7ea5e8c0e57d5f3d1e7"

DEPENDS = "npm-babel-runtime-corejs3-native \
           npm-babel-runtime-native"

SRC_URI = "https://registry.npmjs.org/aria-query/-/aria-query-4.2.2.tgz"
SRC_URI[md5sum] = "abb409e5e0118ee2c00a196cc7654750"
SRC_URI[sha256sum] = "570ee1a670279e49a0f9a6c95560004acf2f6da00f9c9b7dfebe691c46a88030"

NPM_PKGNAME = "aria-query"

inherit npmhelper
inherit native
