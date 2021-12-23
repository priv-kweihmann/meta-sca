SUMMARY = "NPM: extsprintf"
DESCRIPTION = "extended POSIX-style sprintf"
HOMEPAGE = "https://github.com/davepacheco/node-extsprintf#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/extsprintf/-/extsprintf-1.4.1.tgz"
SRC_URI[md5sum] = "3660a7a2a7999dde7c81a7ec863a651f"
SRC_URI[sha256sum] = "454fd6d5c82b12ac1445094d234c78f47aed86b26b25f8bb2812b05cdb2d7acc"

NPM_PKGNAME = "extsprintf"

inherit npmhelper
inherit native
