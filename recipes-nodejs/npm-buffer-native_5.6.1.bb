SUMMARY = "NPM: buffer"
DESCRIPTION = "Node.js Buffer API, for the browser"
HOMEPAGE = "https://github.com/feross/buffer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e49e579dbcc02cf1f699deec85fd96f0"

DEPENDS = "npm-base64-js-native \
           npm-ieee754-native"

SRC_URI = "https://registry.npmjs.org/buffer/-/buffer-5.6.1.tgz"
SRC_URI[md5sum] = "df04afa6b61f4f1a2a739e2059e7f9b5"
SRC_URI[sha256sum] = "0d83df3b1b96061ded5d56ca6d4928558adee365bde89338f768e4c7ef42d119"

NPM_PKGNAME = "buffer"

inherit npmhelper
inherit native
