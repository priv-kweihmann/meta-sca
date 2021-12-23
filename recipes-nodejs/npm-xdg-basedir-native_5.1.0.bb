SUMMARY = "NPM: xdg-basedir"
DESCRIPTION = "Get XDG Base Directory paths"
HOMEPAGE = "https://github.com/sindresorhus/xdg-basedir#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/xdg-basedir/-/xdg-basedir-5.1.0.tgz"
SRC_URI[md5sum] = "c3b0b267fca177e07eed5558df35dc12"
SRC_URI[sha256sum] = "5efa29c81b3fa106d3fb74d009df4aa9d946dcc957bfcc8ab0a635eeebffac73"

NPM_PKGNAME = "xdg-basedir"

inherit npmhelper
inherit native
