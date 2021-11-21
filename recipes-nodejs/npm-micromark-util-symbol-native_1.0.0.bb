SUMMARY = "NPM: micromark-util-symbol"
DESCRIPTION = "micromark utility with symbols"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=75;endline=76;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/micromark-util-symbol/-/micromark-util-symbol-1.0.0.tgz"
SRC_URI[md5sum] = "9c25759d9c4c60220ab4bd12c9864f9f"
SRC_URI[sha256sum] = "2fa5f021cbfdfdb6c207adfd71de72d052fe437a954e44a5bfa535d576c0157a"

NPM_PKGNAME = "micromark-util-symbol"

inherit npmhelper
inherit native
