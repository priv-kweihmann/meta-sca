SUMMARY = "NPM: cli-width"
DESCRIPTION = "Get stdout window width, with two fallbacks, tty and then a default."
HOMEPAGE = "https://github.com/knownasilya/cli-width"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cfb072f1bc7e564626cd6b5164a13e59"

SRC_URI = "https://registry.npmjs.org/cli-width/-/cli-width-2.2.1.tgz"
SRC_URI[md5sum] = "c9cf40c64a983c42f8fd91a97542f25e"
SRC_URI[sha256sum] = "efe546517e03d46988675dcf2f640dcf1676f0fcffe8b132defa22a7e9c9716e"

NPM_PKGNAME = "cli-width"

inherit npmhelper
inherit native
