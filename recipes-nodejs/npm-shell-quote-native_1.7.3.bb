SUMMARY = "NPM: shell-quote"
DESCRIPTION = "quote and parse shell commands"
HOMEPAGE = "https://github.com/substack/node-shell-quote"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31f6d70a3b756797901b2aff55cc7d7a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/shell-quote/-/shell-quote-1.7.3.tgz"
SRC_URI[md5sum] = "273f97fcbb0cf19c17e239ee0b35c4c0"
SRC_URI[sha256sum] = "568d0eddf164f1c4eb1b3a0024d5d4b2069c0ee657ee976315b08689ad0d204b"

NPM_PKGNAME = "shell-quote"

inherit npmhelper
inherit native
