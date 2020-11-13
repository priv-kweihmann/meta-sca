SUMMARY = "NPM: buffer"
DESCRIPTION = "Node.js Buffer API, for the browser"
HOMEPAGE = "https://github.com/feross/buffer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e49e579dbcc02cf1f699deec85fd96f0"

DEPENDS = "npm-base64-js-native \
           npm-ieee754-native"

SRC_URI = "https://registry.npmjs.org/buffer/-/buffer-6.0.2.tgz"
SRC_URI[md5sum] = "d9766f2aa46637a99ff949467ca63d85"
SRC_URI[sha256sum] = "e7b8a78fca3f5ad21b0555bc4464b8e0903aa6da7a74e59334b3e39113cb8153"

NPM_PKGNAME = "buffer"

inherit npmhelper
inherit native
