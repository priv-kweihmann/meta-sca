SUMMARY = "NPM: no-cliches"
DESCRIPTION = "Find clichés in your writings"
HOMEPAGE = "https://github.com/duereg/no-cliches"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ad1ea741b5c8f9d521103277c196d2dd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/no-cliches/-/no-cliches-0.3.0.tgz"
SRC_URI[md5sum] = "cc1ccc4b04c15e6650b994483530d282"
SRC_URI[sha256sum] = "7a4f489ed7ddf2fa73d96c390e79fdb0e72968b8ee6fb095380563528840440c"

NPM_PKGNAME = "no-cliches"

inherit npmhelper
inherit native
