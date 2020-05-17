SUMMARY = "NPM: is-buffer"
DESCRIPTION = "Determine if an object is a Buffer"
HOMEPAGE = "https://github.com/feross/is-buffer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761"

SRC_URI = "https://registry.npmjs.org/is-buffer/-/is-buffer-2.0.4.tgz"
SRC_URI[md5sum] = "76786e65ae9e52ada9cc3b6f54d615cb"
SRC_URI[sha256sum] = "e9626930dd5524732d20988dbb156cfb6e7cef40d1dceb5a631bf7ee7b263c51"

NPM_PKGNAME = "is-buffer"

inherit npmhelper
inherit native
