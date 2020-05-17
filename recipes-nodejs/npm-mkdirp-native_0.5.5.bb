SUMMARY = "NPM: mkdirp"
DESCRIPTION = "Recursively mkdir, like `mkdir -p`"
HOMEPAGE = "https://github.com/substack/node-mkdirp#readme"

DEPENDS = "npm-minimist-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b"

SRC_URI = "https://registry.npmjs.org/mkdirp/-/mkdirp-0.5.5.tgz"
SRC_URI[md5sum] = "7e445b65cc532ae036e685117d5fe44d"
SRC_URI[sha256sum] = "4e5ab01a61e329dd14d4020ce846e3abd93ee79b0f788f22fd5d5b4a61b1bb0a"

NPM_PKGNAME = "mkdirp"

inherit npmhelper
inherit native
