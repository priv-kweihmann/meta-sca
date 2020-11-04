SUMMARY = "NPM: buffer"
DESCRIPTION = "Node.js Buffer API, for the browser"
HOMEPAGE = "https://github.com/feross/buffer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e49e579dbcc02cf1f699deec85fd96f0"

DEPENDS = "npm-base64-js-native \
           npm-ieee754-native"

SRC_URI = "https://registry.npmjs.org/buffer/-/buffer-6.0.0.tgz"
SRC_URI[md5sum] = "1600f45e9071210029e9c19fa5734596"
SRC_URI[sha256sum] = "c60c5e4c1658e5ff26132234406cdfe36c407ac801b2671fcc52a8495cd91e1c"

NPM_PKGNAME = "buffer"

inherit npmhelper
inherit native
