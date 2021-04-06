SUMMARY = "NPM: xdg-basedir"
DESCRIPTION = "Get XDG Base Directory paths"
HOMEPAGE = "https://github.com/sindresorhus/xdg-basedir#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/xdg-basedir/-/xdg-basedir-5.0.1.tgz"
SRC_URI[md5sum] = "5d9b4802fe2e7107b615f233b3f79cd4"
SRC_URI[sha256sum] = "3f048a811d8ffce495546006c97e6b57b9715c12eefbba37d8ff5628dd7e1e70"

NPM_PKGNAME = "xdg-basedir"

inherit npmhelper
inherit native
