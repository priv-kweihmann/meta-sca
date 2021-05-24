SUMMARY = "NPM: micromark-extension-gfm-strikethrough"
DESCRIPTION = "micromark extension to support GFM strikethrough"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-strikethrough#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-strikethrough/-/micromark-extension-gfm-strikethrough-0.6.5.tgz"
SRC_URI[md5sum] = "eb3bbb8230a746198e3cc1a971802fc1"
SRC_URI[sha256sum] = "90b8a355f802996e30122bc3ca778c298e3d9dba77dd6e500df2e9b337eaa581"

NPM_PKGNAME = "micromark-extension-gfm-strikethrough"

inherit npmhelper
inherit native
