SUMMARY = "NPM: shell-quote"
DESCRIPTION = "quote and parse shell commands"
HOMEPAGE = "https://github.com/substack/node-shell-quote"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31f6d70a3b756797901b2aff55cc7d7a"

SRC_URI = "https://registry.npmjs.org/shell-quote/-/shell-quote-1.7.2.tgz"
SRC_URI[md5sum] = "793294f9d6917ecf778e92f35298cbec"
SRC_URI[sha256sum] = "acbfa9bdcca8afb26b9a674de099c0abbea59c2556e372e30d87fa56f714b04a"

NPM_PKGNAME = "shell-quote"

inherit npmhelper
inherit native
