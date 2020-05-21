SUMMARY = "NPM: add-filename-increment"
DESCRIPTION = "When copying or moving files, it's common for operating systems to automatically add an increment or 'copy' to duplicate file names. This does that for Node.js applications, with automatic platform detection and support for Linux, MacOs, and Windows conve"
HOMEPAGE = "https://github.com/jonschlinkert/add-filename-increment"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=abd0e25891525eb13d5a794f550a6ee4"

DEPENDS = "npm-strip-filename-increment-native"

SRC_URI = "https://registry.npmjs.org/add-filename-increment/-/add-filename-increment-1.0.0.tgz"
SRC_URI[md5sum] = "0e17a49312ccf367260e8fa801c1da76"
SRC_URI[sha256sum] = "7d442becd155f6dc3676e8e75e007261138fb7ae9476518a74cb6354a47124b5"

NPM_PKGNAME = "add-filename-increment"

inherit npmhelper
inherit native
